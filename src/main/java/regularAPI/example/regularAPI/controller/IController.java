//package regularAPI.example.regularAPI.controller;
//
//import java.util.List;
//import java.util.UUID;
//
//import org.springframework.http.ResponseEntity;
//import regularAPI.example.regularAPI.domain.driver.Driver;
//
//public interface IController<T> {
//
//    public ResponseEntity<List<T>> get();
//    public ResponseEntity<T> get(UUID id);
//    public ResponseEntity<List<Driver>> patch(String data);
//    //    public ResponseEntity<List<T>> get(String data);
//    public ResponseEntity<T> insert(T obj);
//    public ResponseEntity<T> update(T obj);
//    public ResponseEntity<?> delete(Long id);
//
//}