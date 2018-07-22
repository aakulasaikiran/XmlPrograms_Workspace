
package com.bookserviceproviderexample.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bookserviceproviderexample.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchBooks_QNAME = new QName("http://service.bookserviceproviderexample.com/", "searchBooks");
    private final static QName _SearchBooksResponse_QNAME = new QName("http://service.bookserviceproviderexample.com/", "searchBooksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bookserviceproviderexample.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchBooksResponse }
     * 
     */
    public SearchBooksResponse createSearchBooksResponse() {
        return new SearchBooksResponse();
    }

    /**
     * Create an instance of {@link SearchBooks }
     * 
     */
    public SearchBooks createSearchBooks() {
        return new SearchBooks();
    }

    /**
     * Create an instance of {@link SearchResults }
     * 
     */
    public SearchResults createSearchResults() {
        return new SearchResults();
    }

    /**
     * Create an instance of {@link SearchParameters }
     * 
     */
    public SearchParameters createSearchParameters() {
        return new SearchParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bookserviceproviderexample.com/", name = "searchBooks")
    public JAXBElement<SearchBooks> createSearchBooks(SearchBooks value) {
        return new JAXBElement<SearchBooks>(_SearchBooks_QNAME, SearchBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bookserviceproviderexample.com/", name = "searchBooksResponse")
    public JAXBElement<SearchBooksResponse> createSearchBooksResponse(SearchBooksResponse value) {
        return new JAXBElement<SearchBooksResponse>(_SearchBooksResponse_QNAME, SearchBooksResponse.class, null, value);
    }

}
