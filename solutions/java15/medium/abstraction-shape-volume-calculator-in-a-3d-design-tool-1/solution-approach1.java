// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-oops/challenges/abstraction-shape-volume-calculator-in-a-3d-design-tool-1/problem?isFullScreen=true
// Problem     Abstraction - Shape Volume Calculator in a 3D Design Tool 1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-29, 08:46 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

// Abstract class Volume
abstract class Volume {
    protected String name;

    public Volume(String name) {
        this.name = name;
    }

    abstract Float calculateVolume();
}

// VolumeOfSphere
class VolumeOfSphere extends Volume {
    private Integer radius;

    public VolumeOfSphere(String name, Integer radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    Float calculateVolume() {
        return (float) (4.0 / 3.0 * 3.14 * radius * radius * radius);
    }
}

// VolumeOfCube
class VolumeOfCube extends Volume {
    private Integer side;

    public VolumeOfCube(String name, Integer side) {
        super(name);
        this.side = side;
    }

    @Override
    Float calculateVolume() {
        return (float) (side * side * side);
    }
}

// VolumeOfCuboid
class VolumeOfCuboid extends Volume {
    private Integer length;
    private Integer breadth;
    private Integer height;

    public VolumeOfCuboid(String name, Integer length, Integer breadth, Integer height) {
        super(name);
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    Float calculateVolume() {
        return (float) (length * breadth * height);
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shape (Sphere, Cube, or Cuboid):");
        String shape = sc.nextLine().trim();

        Volume volume = null;

        if (shape.equalsIgnoreCase("Sphere")) {
            System.out.println("Enter the radius of the sphere:");
            int radius = Integer.parseInt(sc.nextLine().trim());

            if (radius < 0) {
                System.out.println("Invalid Input");
                sc.close();
                return;
            }
            volume = new VolumeOfSphere("Sphere", radius);

        } else if (shape.equalsIgnoreCase("Cube")) {
            System.out.println("Enter the side of the cube:");
            int side = Integer.parseInt(sc.nextLine().trim());

            if (side < 0) {
                System.out.println("Invalid Input");
                sc.close();
                return;
            }
            volume = new VolumeOfCube("Cube", side);

        } else if (shape.equalsIgnoreCase("Cuboid")) {
            System.out.println("Enter the length of the cuboid:");
            int length = Integer.parseInt(sc.nextLine().trim());

            System.out.println("Enter the breadth of the cuboid:");
            int breadth = Integer.parseInt(sc.nextLine().trim());

            System.out.println("Enter the height of the cuboid:");
            int height = Integer.parseInt(sc.nextLine().trim());

            if (length < 0 || breadth < 0 || height < 0) {
                System.out.println("Invalid Input");
                sc.close();
                return;
            }
            volume = new VolumeOfCuboid("Cuboid", length, breadth, height);

        } else {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        // Runtime polymorphism: correct overridden method executes
        float result = volume.calculateVolume();

        System.out.printf("The volume of the %s is %.2f%n", shape.toLowerCase(), result);

        sc.close();
    }
}
