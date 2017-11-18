
package xmclient.soapentities;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmclient.soapentities package. 
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

    private final static QName _ReadingReportItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "ReadingReportItem");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfBorderResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "ArrayOfBorderResult");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _UserData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "UserData");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _BorderStatusResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "BorderStatusResult");
    private final static QName _ProcessRequestResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "ProcessRequestResult");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ReportReadingProcessResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "ReportReadingProcessResult");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfReadingReportItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "ArrayOfReadingReportItem");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _BorderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "BorderStatus");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _BorderResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "BorderResult");
    private final static QName _ProcessResultFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "ProcessResultFlag");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfBorderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "ArrayOfBorderStatus");
    private final static QName _ArrayOfdouble_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdouble");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _GetProcessResultResponseGetProcessResultResult_QNAME = new QName("http://tempuri.org/", "GetProcessResultResult");
    private final static QName _ReadingReportItemBorderCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "BorderCode");
    private final static QName _ReadingReportItemReadings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "Readings");
    private final static QName _BorderStatusResultResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "Results");
    private final static QName _BorderStatusResultMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "Message");
    private final static QName _BorderResultCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "Code");
    private final static QName _BorderResultValidationErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "ValidationErrorMessage");
    private final static QName _BorderResultErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "ErrorMessage");
    private final static QName _ReportReadingsReadings_QNAME = new QName("http://tempuri.org/", "readings");
    private final static QName _ReportReadingsUserData_QNAME = new QName("http://tempuri.org/", "userData");
    private final static QName _UserDataPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "Password");
    private final static QName _UserDataUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "UserName");
    private final static QName _GetBorderStatusResponseGetBorderStatusResult_QNAME = new QName("http://tempuri.org/", "GetBorderStatusResult");
    private final static QName _ReportReadingsResponseReportReadingsResult_QNAME = new QName("http://tempuri.org/", "ReportReadingsResult");
    private final static QName _BorderStatusType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "Type");
    private final static QName _BorderStatusCGMCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", "CGMCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmclient.soapentities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReportReadingsResponse }
     * 
     */
    public ReportReadingsResponse createReportReadingsResponse() {
        return new ReportReadingsResponse();
    }

    /**
     * Create an instance of {@link ProcessRequestResult }
     * 
     */
    public ProcessRequestResult createProcessRequestResult() {
        return new ProcessRequestResult();
    }

    /**
     * Create an instance of {@link ReportReadings }
     * 
     */
    public ReportReadings createReportReadings() {
        return new ReportReadings();
    }

    /**
     * Create an instance of {@link ArrayOfReadingReportItem }
     * 
     */
    public ArrayOfReadingReportItem createArrayOfReadingReportItem() {
        return new ArrayOfReadingReportItem();
    }

    /**
     * Create an instance of {@link UserData }
     * 
     */
    public UserData createUserData() {
        return new UserData();
    }

    /**
     * Create an instance of {@link GetProcessResultResponse }
     * 
     */
    public GetProcessResultResponse createGetProcessResultResponse() {
        return new GetProcessResultResponse();
    }

    /**
     * Create an instance of {@link ReportReadingProcessResult }
     * 
     */
    public ReportReadingProcessResult createReportReadingProcessResult() {
        return new ReportReadingProcessResult();
    }

    /**
     * Create an instance of {@link GetBorderStatus }
     * 
     */
    public GetBorderStatus createGetBorderStatus() {
        return new GetBorderStatus();
    }

    /**
     * Create an instance of {@link GetBorderStatusResponse }
     * 
     */
    public GetBorderStatusResponse createGetBorderStatusResponse() {
        return new GetBorderStatusResponse();
    }

    /**
     * Create an instance of {@link BorderStatusResult }
     * 
     */
    public BorderStatusResult createBorderStatusResult() {
        return new BorderStatusResult();
    }

    /**
     * Create an instance of {@link GetProcessResult }
     * 
     */
    public GetProcessResult createGetProcessResult() {
        return new GetProcessResult();
    }

    /**
     * Create an instance of {@link ArrayOfBorderStatus }
     * 
     */
    public ArrayOfBorderStatus createArrayOfBorderStatus() {
        return new ArrayOfBorderStatus();
    }

    /**
     * Create an instance of {@link BorderStatus }
     * 
     */
    public BorderStatus createBorderStatus() {
        return new BorderStatus();
    }

    /**
     * Create an instance of {@link BorderResult }
     * 
     */
    public BorderResult createBorderResult() {
        return new BorderResult();
    }

    /**
     * Create an instance of {@link ArrayOfBorderResult }
     * 
     */
    public ArrayOfBorderResult createArrayOfBorderResult() {
        return new ArrayOfBorderResult();
    }

    /**
     * Create an instance of {@link ReadingReportItem }
     * 
     */
    public ReadingReportItem createReadingReportItem() {
        return new ReadingReportItem();
    }

    /**
     * Create an instance of {@link ArrayOfdouble }
     * 
     */
    public ArrayOfdouble createArrayOfdouble() {
        return new ArrayOfdouble();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadingReportItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "ReadingReportItem")
    public JAXBElement<ReadingReportItem> createReadingReportItem(ReadingReportItem value) {
        return new JAXBElement<ReadingReportItem>(_ReadingReportItem_QNAME, ReadingReportItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBorderResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "ArrayOfBorderResult")
    public JAXBElement<ArrayOfBorderResult> createArrayOfBorderResult(ArrayOfBorderResult value) {
        return new JAXBElement<ArrayOfBorderResult>(_ArrayOfBorderResult_QNAME, ArrayOfBorderResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "UserData")
    public JAXBElement<UserData> createUserData(UserData value) {
        return new JAXBElement<UserData>(_UserData_QNAME, UserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorderStatusResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "BorderStatusResult")
    public JAXBElement<BorderStatusResult> createBorderStatusResult(BorderStatusResult value) {
        return new JAXBElement<BorderStatusResult>(_BorderStatusResult_QNAME, BorderStatusResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "ProcessRequestResult")
    public JAXBElement<ProcessRequestResult> createProcessRequestResult(ProcessRequestResult value) {
        return new JAXBElement<ProcessRequestResult>(_ProcessRequestResult_QNAME, ProcessRequestResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportReadingProcessResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "ReportReadingProcessResult")
    public JAXBElement<ReportReadingProcessResult> createReportReadingProcessResult(ReportReadingProcessResult value) {
        return new JAXBElement<ReportReadingProcessResult>(_ReportReadingProcessResult_QNAME, ReportReadingProcessResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReadingReportItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "ArrayOfReadingReportItem")
    public JAXBElement<ArrayOfReadingReportItem> createArrayOfReadingReportItem(ArrayOfReadingReportItem value) {
        return new JAXBElement<ArrayOfReadingReportItem>(_ArrayOfReadingReportItem_QNAME, ArrayOfReadingReportItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "BorderStatus")
    public JAXBElement<BorderStatus> createBorderStatus(BorderStatus value) {
        return new JAXBElement<BorderStatus>(_BorderStatus_QNAME, BorderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorderResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "BorderResult")
    public JAXBElement<BorderResult> createBorderResult(BorderResult value) {
        return new JAXBElement<BorderResult>(_BorderResult_QNAME, BorderResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResultFlag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "ProcessResultFlag")
    public JAXBElement<ProcessResultFlag> createProcessResultFlag(ProcessResultFlag value) {
        return new JAXBElement<ProcessResultFlag>(_ProcessResultFlag_QNAME, ProcessResultFlag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBorderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "ArrayOfBorderStatus")
    public JAXBElement<ArrayOfBorderStatus> createArrayOfBorderStatus(ArrayOfBorderStatus value) {
        return new JAXBElement<ArrayOfBorderStatus>(_ArrayOfBorderStatus_QNAME, ArrayOfBorderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfdouble")
    public JAXBElement<ArrayOfdouble> createArrayOfdouble(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_ArrayOfdouble_QNAME, ArrayOfdouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportReadingProcessResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProcessResultResult", scope = GetProcessResultResponse.class)
    public JAXBElement<ReportReadingProcessResult> createGetProcessResultResponseGetProcessResultResult(ReportReadingProcessResult value) {
        return new JAXBElement<ReportReadingProcessResult>(_GetProcessResultResponseGetProcessResultResult_QNAME, ReportReadingProcessResult.class, GetProcessResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "BorderCode", scope = ReadingReportItem.class)
    public JAXBElement<String> createReadingReportItemBorderCode(String value) {
        return new JAXBElement<String>(_ReadingReportItemBorderCode_QNAME, String.class, ReadingReportItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "Readings", scope = ReadingReportItem.class)
    public JAXBElement<ArrayOfdouble> createReadingReportItemReadings(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_ReadingReportItemReadings_QNAME, ArrayOfdouble.class, ReadingReportItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBorderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "Results", scope = BorderStatusResult.class)
    public JAXBElement<ArrayOfBorderStatus> createBorderStatusResultResults(ArrayOfBorderStatus value) {
        return new JAXBElement<ArrayOfBorderStatus>(_BorderStatusResultResults_QNAME, ArrayOfBorderStatus.class, BorderStatusResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "Message", scope = BorderStatusResult.class)
    public JAXBElement<String> createBorderStatusResultMessage(String value) {
        return new JAXBElement<String>(_BorderStatusResultMessage_QNAME, String.class, BorderStatusResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "Code", scope = BorderResult.class)
    public JAXBElement<String> createBorderResultCode(String value) {
        return new JAXBElement<String>(_BorderResultCode_QNAME, String.class, BorderResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "ValidationErrorMessage", scope = BorderResult.class)
    public JAXBElement<String> createBorderResultValidationErrorMessage(String value) {
        return new JAXBElement<String>(_BorderResultValidationErrorMessage_QNAME, String.class, BorderResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "ErrorMessage", scope = BorderResult.class)
    public JAXBElement<String> createBorderResultErrorMessage(String value) {
        return new JAXBElement<String>(_BorderResultErrorMessage_QNAME, String.class, BorderResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBorderResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "Results", scope = ReportReadingProcessResult.class)
    public JAXBElement<ArrayOfBorderResult> createReportReadingProcessResultResults(ArrayOfBorderResult value) {
        return new JAXBElement<ArrayOfBorderResult>(_BorderStatusResultResults_QNAME, ArrayOfBorderResult.class, ReportReadingProcessResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReadingReportItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "readings", scope = ReportReadings.class)
    public JAXBElement<ArrayOfReadingReportItem> createReportReadingsReadings(ArrayOfReadingReportItem value) {
        return new JAXBElement<ArrayOfReadingReportItem>(_ReportReadingsReadings_QNAME, ArrayOfReadingReportItem.class, ReportReadings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userData", scope = ReportReadings.class)
    public JAXBElement<UserData> createReportReadingsUserData(UserData value) {
        return new JAXBElement<UserData>(_ReportReadingsUserData_QNAME, UserData.class, ReportReadings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "Password", scope = UserData.class)
    public JAXBElement<String> createUserDataPassword(String value) {
        return new JAXBElement<String>(_UserDataPassword_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "UserName", scope = UserData.class)
    public JAXBElement<String> createUserDataUserName(String value) {
        return new JAXBElement<String>(_UserDataUserName_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "ErrorMessage", scope = ProcessRequestResult.class)
    public JAXBElement<String> createProcessRequestResultErrorMessage(String value) {
        return new JAXBElement<String>(_BorderResultErrorMessage_QNAME, String.class, ProcessRequestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorderStatusResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBorderStatusResult", scope = GetBorderStatusResponse.class)
    public JAXBElement<BorderStatusResult> createGetBorderStatusResponseGetBorderStatusResult(BorderStatusResult value) {
        return new JAXBElement<BorderStatusResult>(_GetBorderStatusResponseGetBorderStatusResult_QNAME, BorderStatusResult.class, GetBorderStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userData", scope = GetProcessResult.class)
    public JAXBElement<UserData> createGetProcessResultUserData(UserData value) {
        return new JAXBElement<UserData>(_ReportReadingsUserData_QNAME, UserData.class, GetProcessResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userData", scope = GetBorderStatus.class)
    public JAXBElement<UserData> createGetBorderStatusUserData(UserData value) {
        return new JAXBElement<UserData>(_ReportReadingsUserData_QNAME, UserData.class, GetBorderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessRequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReportReadingsResult", scope = ReportReadingsResponse.class)
    public JAXBElement<ProcessRequestResult> createReportReadingsResponseReportReadingsResult(ProcessRequestResult value) {
        return new JAXBElement<ProcessRequestResult>(_ReportReadingsResponseReportReadingsResult_QNAME, ProcessRequestResult.class, ReportReadingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "BorderCode", scope = BorderStatus.class)
    public JAXBElement<String> createBorderStatusBorderCode(String value) {
        return new JAXBElement<String>(_ReadingReportItemBorderCode_QNAME, String.class, BorderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "Type", scope = BorderStatus.class)
    public JAXBElement<String> createBorderStatusType(String value) {
        return new JAXBElement<String>(_BorderStatusType_QNAME, String.class, BorderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", name = "CGMCode", scope = BorderStatus.class)
    public JAXBElement<String> createBorderStatusCGMCode(String value) {
        return new JAXBElement<String>(_BorderStatusCGMCode_QNAME, String.class, BorderStatus.class, value);
    }

}
