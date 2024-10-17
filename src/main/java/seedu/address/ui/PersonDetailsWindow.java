package seedu.address.ui;

import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import seedu.address.commons.core.LogsCenter;

/**
 * Controller for the person details window.
 */
public class PersonDetailsWindow extends UiPart<Stage> {

    private static final String FXML = "PersonDetailsWindow.fxml";

    private final Logger logger = LogsCenter.getLogger(getClass());
    @FXML
    private Label nameLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label phoneLabel;

    @FXML
    private Label addressLabel;
    /**
     * Creates a new PersonDetailsWindow.
     *
     * @param root Stage to use as the root of the PersonDetailsWindow.
     */
    public PersonDetailsWindow(Stage root) {
        super(FXML, root);
    }

    /**
     * Creates a new PersonDetailsWindow.
     */
    public PersonDetailsWindow() {
        this(new Stage());
    }

    /**
     * Shows the person details window.
     *
     * @param name The name of the person.
     * @param email The email of the person.
     * @param phone The phone number of the person.
     * @param address The address of the person.
     * @throws IllegalStateException if this method is called on a thread other than the JavaFX Application Thread,
     *                               or if this method is called during animation or layout processing.
     */
    public void show(String name, String email, String address, String phone) {
        logger.fine("Showing detailed page about this person.");
        nameLabel.setText("Name: " + name);
        emailLabel.setText("Email: " + email);
        phoneLabel.setText("Phone: " + phone);
        addressLabel.setText("Address: " + address);
        getRoot().show();
        getRoot().centerOnScreen();
    }

    /**
     * Returns true if the Person's detail window is currently being shown.
     */
    public boolean isShowing() {
        return getRoot().isShowing();
    }


    /**
     * Focuses on the detail window.
     */
    public void focus() {
        getRoot().requestFocus();
    }

    /**
     * Hides the person details window.
     */
    public void hide() {
        getRoot().hide();
    }
}
