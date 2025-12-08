package brainclash.api.controller;


import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private final Firestore firestore;

    public CategoriaController(Firestore firestore) {
        this.firestore = firestore;
    }

    @GetMapping(value = "/getAll")
    public String getCategorias(){
        CollectionReference collectionReference = firestore.collection("categorias");
        String result = "";
        try {

            QuerySnapshot querySnapshot = collectionReference.get().get();
            for (QueryDocumentSnapshot queryDocumentSnapshot : querySnapshot) {
                result += queryDocumentSnapshot.getString("nome") + " ";
            }
            
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

}
