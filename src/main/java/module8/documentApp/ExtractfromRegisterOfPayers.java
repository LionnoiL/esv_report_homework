package module8.documentApp;

public class ExtractfromRegisterOfPayers implements ReadOnlyDocumentService{
    @Override
    public Document generate() {
        return new Document("Extract from register of payers ");
    }
}
