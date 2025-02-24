import java.sql.SQLOutput;
import java.util.ArrayList;

public class Einkaufsliste {
    private ArrayList<String> einkaufsliste = new ArrayList<String>();

    public void useListener() {
        String input;
        boolean running = true;
        while (running) {
            System.out.print("> ");
            input = System.console().readLine();
            if (input.equals("exit")|| input.equals("Exit")) {
                running = false;
            } else if (input.equals("list")|| input.equals("List")) {
                getList();
            } else if (input.startsWith("add") || input.startsWith("Add")) {
                addToList(input.substring(3));
            } else if (input.startsWith("remove") || input.startsWith("Remove")) {
                removeFromList(input.substring(6));
            } else if (input.startsWith("help") || input.startsWith("Help")) {
                System.out.println("Commands: list, add [item], remove [item], exit");
            } else if (input.isEmpty()) {
                System.out.println("Please enter a command!");
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void addToList(String item) {
        if(item.isEmpty()) {
            System.out.println("Please enter an item to add!");
        } else {
            einkaufsliste.add(item);
            System.out.println("Added " + item + " to the list.");
        }
    }

    public void getList() {
        if(einkaufsliste.isEmpty()) {
            System.out.println("Your list is empty!");
        } else {
            System.out.println("~~~ Shopping List ~~~");
            for (String item : einkaufsliste) {
                System.out.print("- ");
                System.out.println(item);
            }
        }

    }

    public void removeFromList(String item) {
        if(item.isEmpty()) {
            System.out.println("Please enter an item to remove!");
        } else if (einkaufsliste.remove(item)) {
            System.out.println("Removed " + item + " from the list.");
        } else {
            System.out.println("Item not found in the list.");
        }
    }
}
