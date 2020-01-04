public class DemoRocks {
    public static void main(String[] args){
        Rock your_rock = new Rock(0, 1);
        System.out.println("Your rock is " + your_rock.getClass());
        System.out.println("The your rock is " + your_rock.getDesc() + ", sample number " +  your_rock.getSample());
        System.out.println("The your rock weighs " + your_rock.getWeight() + " grams");

        IgneousRock red_rock = new IgneousRock(1, 50);
        System.out.println("The red rock is " + red_rock.getClass());
        System.out.println("The red rock is a " + red_rock.getDesc() + ", sample number " +  red_rock.getSample());
        System.out.println("The red rock weighs " + red_rock.getWeight() + " grams");

        SedimentaryRock funny_rock = new SedimentaryRock(2, 150);
        System.out.println("The funny rock is " + funny_rock.getClass());
        System.out.println("The funny rock is a " + funny_rock.getDesc());
        System.out.println("Sample number " + funny_rock.getSample() + " and weighs " + funny_rock.getWeight() + " grams");

        MetamorphicRock weird_rock = new MetamorphicRock(3, 500);
        System.out.println("The weird rock is " + weird_rock.getClass());
        System.out.println("The weird rock is a " + weird_rock.getDesc());
        System.out.println("The weird rock is sample number " + weird_rock.getSample() + " and weighs " + weird_rock.getWeight() +  " grams");

    }
}
