package net.sf.jabref.gui.actions;

import net.sf.jabref.Globals;
import net.sf.jabref.JabRefPreferences;
import net.sf.jabref.MetaData;
import net.sf.jabref.gui.IconTheme;
import net.sf.jabref.gui.JabRefFrame;
import net.sf.jabref.logic.l10n.Localization;
import net.sf.jabref.model.database.BibtexDatabase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.nio.charset.Charset;

/**
 * The action concerned with opening a new database.
 */
public class NewDatabaseAction extends MnemonicAwareAction {
    private final JabRefFrame jabRefFrame;

    public NewDatabaseAction(JabRefFrame jabRefFrame) {
        super(IconTheme.JabRefIcon.NEW.getIcon());
        this.jabRefFrame = jabRefFrame;
        putValue(Action.NAME, Localization.menuTitle("New database"));
        putValue(Action.SHORT_DESCRIPTION, Localization.lang("New BibTeX database"));
        //putValue(MNEMONIC_KEY, GUIGlobals.newKeyCode);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Create a new, empty, database.
        BibtexDatabase database = new BibtexDatabase();
        jabRefFrame.addTab(database, null, new MetaData(),
                Charset.forName(Globals.prefs.get(JabRefPreferences.DEFAULT_ENCODING)), true);
        jabRefFrame.output(Localization.lang("New database created."));
    }
}
