package controlFlow;

public class ExampleSwitch {
    public static void main(String[] args) {
        String extension = "pdf";
        int month = 3;

        switch (extension){
            case "docx":
                System.out.println("This file is docx");
                break;
            case "pptx":
                System.out.println("This file is pptx");
                break;
            case "pdf":
                System.out.println("This file is pdf");
                break;
            case "txt":
                System.out.println("This file is txt");
                break;
            default:
                System.out.println();
        }
        System.out.println("---------------------------------------------");
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            case 2:
                System.out.println("This month has 28 or 29 days");
                break;
        }
    }
}
