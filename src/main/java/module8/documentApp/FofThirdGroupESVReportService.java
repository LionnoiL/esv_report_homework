package module8.documentApp;

public class FofThirdGroupESVReportService extends ReportForFOPDeclarationService{

    @Override
    public void fill(Document document, DocumentFillingData fillingData) {
        System.out.println("FofThirdGroupESVReportService fill data");
        String filledDocumentData = document.getDocumentData() + fillingData.getDataToFill();

        document.setDocumentData(filledDocumentData);
        System.out.println("FofThirdGroupESVReportService declaration:" + document);
    }

    @Override
    public Document generate() {
        System.out.println("FofThirdGroupESVReportService Generating declaration.......");
        return new Document("Here is my esv declaration:");
    }
}
