package Design_Patterns.C_Behavioural_Patterns.MomentoPattern.Example_TextEditor;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {

    private final TextArea textArea;
    private final Deque<TextArea.Memento> stateHistory;

    public Editor() {
        textArea = new TextArea();
        stateHistory = new LinkedList<>();
    }

    public void write(String text) {
        textArea.set(text);
        stateHistory.offer(textArea.takeSnapshot());
    }

    public void undo() {
        if (stateHistory.isEmpty()) {
            return;
        }
        stateHistory.pollLast();
        textArea.restore(stateHistory.peekLast());
    }

    public void printText() {
        System.out.println(textArea.getText());
    }

}