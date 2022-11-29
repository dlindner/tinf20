package de.dhbw.tinf20.pattern.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class NewUserDialog extends JDialog {

	// [...]
	private final JButton saveButton;
	private final CardPrinterInterface printer;

	public NewUserDialog(CardPrinterInterface printer) {
		super();
		this.printer = printer;
		this.saveButton = new JButton("Speichern");
		this.saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveUser();
			}
		});
	}

	private void saveUser() {
//		final User toSave = new User(firstName(), lastName(), role());
//		this.printer.printAuthorizationFor(toSave);
//		Database.getInstance().save(toSave);
//		Application.getInstance().getDataModel().users().refresh();
	}
}