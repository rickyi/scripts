import com.altirnao.aodocs.custom.*;
import com.altirnao.aodocs.custom.DocumentService;
import com.altirnao.aodocs.custom.ReadableDocument;

public void execute(ReadableDocument document) throws Exception {
  DocumentService ds = getDocumentService();
  Document doc = ds.lockDocument(document);
  ds.delete(doc, false);
}
