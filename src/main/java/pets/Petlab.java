package pets;


public class Petlab {
        private String speak;
        private String name;

        public String getSpeech(){
            return speak;
        }
        public String getName(){
            return name;
        }

        public void petElements (String speak, String name){
            this.speak = speak;
            this.name = name;
        }

    public void Speak (){
        System.out.println("This is what my pet says");
    }


    /*
    pt. 1
     Ask how many pets user has
     user inputs how many pets they have
     Ask user what kind of pets and what are the names of each pet
     print list of info
    pt2.
    create class that supports at least 3 pets (dog, cat, 1 more)
    create subclasses
    speak method that overrides each subclass
    name field w/setters and getters
    pt3.


    /*
    initialized scanner
    prompt the user how many pets do they have
    store the number of pets inside an int

    repeatably ask:
        prompt the user for pet type then name
        stores that name inside a separate String
        because we are only asking for one name at a time
        then print out name while pet is speaking

        prompt the user what kind of pet what kind of pet
        if the user the types in dog
            create new dog object
        otherwise the user the types in cat
            create new cat object
        otherwise the user the types in bird
                    create new bird object

       then make the object speak/ make noise
       example call dog is speaking then only dog makes noise
               call cat is speaking then only cat makes noise
               call bird is speaking then only bird makes noise

     */




    }

