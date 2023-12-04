public class Quiz {
    public static void main(String[] args){
        Question question = new MultipleChoiceQuestion(
                "What will you score this assignment?",
                "Highest score",
                "1",
                "3",
                "2",
                "None of the above",
                "a"
        );
        question.check();
        question = new InputQuestion("Type the following statement correctly"+"\n"+"System.___.println('OH MY');",  "out");
        question.check();
        question = new MultipleChoiceQuestion(
                "What is Midjourney?",
                "a stable diffusion AI that converts text to image",
                "Something weird",
                "My mid life crisis",
                "Grass",
                "None of the above",
                "a"
        );
        question.check();
        question = new MultipleChoiceQuestion(
                "What is the correct way to shorthand a 'if' statement?",
                "boolean correct = !animal.equals(dog) ? true : false;",
                "boolean correct = !bug.equals(grasshopper) : true ? false",
                "boolean correct = (!bird.equals(hawk)) ? true : false",
                "not possible",
                "None of the above",
                "c"
        );
        question.check();
        question = new MultipleChoiceQuestion(
                "What does [][] do when placed after the data type?",
                "Makes 2 memory locations for the variable",
                "Declares a abstract method",
                "Creates a hash map",
                "Defines it as a Multidimensional array",
                "None of the above",
                "d"
        );
        question.check();
        question = new MultipleChoiceQuestion(
                "Where is my money?",
                "in my wallet",
                "in the bank",
                "in my closet",
                "in my shoe",
                "None of the above",
                "b"
        );
        question.check();
        question = new TrueFalseQuestion("The sky blue.","TRUE");
        question.check();
        question = new TrueFalseQuestion("A spider an insect.","FALSE");
        question.check();
        question = new TrueFalseQuestion("Unicorns are real.","fALSe");
        question.check();
        question = new TrueFalseQuestion("Tomatoes are fruits.","trUe");
        question.check();
        question = new TrueFalseQuestion("P.L.U.R. stands for Punish Lust Under Respect?","false");
        question.check();
        question.showResults();
    }
}

