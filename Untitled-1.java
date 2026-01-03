import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {

        // Creating Frame
        JFrame frame = new JFrame("User Registration Form");
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title Label
        JLabel title = new JLabel("User Registration");
        title.setBounds(120, 20, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(title);

        // Name Label & TextField
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 70, 100, 30);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 70, 180, 30);
        frame.add(nameField);

        // Email Label & TextField
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 120, 100, 30);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 120, 180, 30);
        frame.add(emailField);

        // Password Label & PasswordField
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 170, 100, 30);
        frame.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 170, 180, 30);
        frame.add(passField);

        // Register Button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(140, 230, 120, 35);
        frame.add(registerButton);

        // Make Frame Visible
        frame.setVisible(true);
    }
}