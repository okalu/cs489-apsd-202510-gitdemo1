public class QuizSimulator {
    public static void main(String[] args) {
        String[][] quiz = {
            {"What are tokens in AI?", "Tokens are the 'word pieces' – how AI reads your code and text. Each character, word or symbol uses tokens."},
            {"What is a context window in AI?", "Context window is how much code/conversation that the AI can 'remember'. Similar to 'short-term memory'."},
            {"What is a hallucination in AI?", "Hallucination is when AI confidently suggests wrong information. Always verify AI suggestions!"},
            {"What is a prompt in AI?", "Prompt is your instructions to the AI tool – can be comment, question or request, that guides what code the AI generates."}
        };

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to the Applied Software Development AI Terminology Quiz!");
        for (int i = 0; i < quiz.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + quiz[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();
            if (userAnswer.equalsIgnoreCase(quiz[i][1])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. Correct answer: " + quiz[i][1]);
            }
        }
        System.out.println("\nQuiz finished! Your score: " + score + "/" + quiz.length);
        scanner.close();
    }
}
