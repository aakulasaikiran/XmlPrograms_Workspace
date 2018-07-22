package jerseyclientexample.service;

import com.jerseyexampleutil.domain.Book;
import com.jerseyexampleutil.domain.ResponseDTO;

public interface BookServiceClient {
public ResponseDTO registerBook(Book book);
}
