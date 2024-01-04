
package default_package;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the default_package package. 
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

    private final static QName _FuncCancelar_QNAME = new QName("http://default_package/", "funcCancelar");
    private final static QName _FuncCancelarResponse_QNAME = new QName("http://default_package/", "funcCancelarResponse");
    private final static QName _FuncListar_QNAME = new QName("http://default_package/", "funcListar");
    private final static QName _FuncListarResponse_QNAME = new QName("http://default_package/", "funcListarResponse");
    private final static QName _FuncReservar_QNAME = new QName("http://default_package/", "funcReservar");
    private final static QName _FuncReservarResponse_QNAME = new QName("http://default_package/", "funcReservarResponse");
    private final static QName _ValidaHora_QNAME = new QName("http://default_package/", "valida_hora");
    private final static QName _ValidaHoraResponse_QNAME = new QName("http://default_package/", "valida_horaResponse");
    private final static QName _ValidaNum_QNAME = new QName("http://default_package/", "valida_num");
    private final static QName _ValidaNumResponse_QNAME = new QName("http://default_package/", "valida_numResponse");
    private final static QName _ValidaPraia_QNAME = new QName("http://default_package/", "valida_praia");
    private final static QName _ValidaPraiaResponse_QNAME = new QName("http://default_package/", "valida_praiaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: default_package
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FuncCancelar }
     * 
     */
    public FuncCancelar createFuncCancelar() {
        return new FuncCancelar();
    }

    /**
     * Create an instance of {@link FuncCancelarResponse }
     * 
     */
    public FuncCancelarResponse createFuncCancelarResponse() {
        return new FuncCancelarResponse();
    }

    /**
     * Create an instance of {@link FuncListar }
     * 
     */
    public FuncListar createFuncListar() {
        return new FuncListar();
    }

    /**
     * Create an instance of {@link FuncListarResponse }
     * 
     */
    public FuncListarResponse createFuncListarResponse() {
        return new FuncListarResponse();
    }

    /**
     * Create an instance of {@link FuncReservar }
     * 
     */
    public FuncReservar createFuncReservar() {
        return new FuncReservar();
    }

    /**
     * Create an instance of {@link FuncReservarResponse }
     * 
     */
    public FuncReservarResponse createFuncReservarResponse() {
        return new FuncReservarResponse();
    }

    /**
     * Create an instance of {@link ValidaHora }
     * 
     */
    public ValidaHora createValidaHora() {
        return new ValidaHora();
    }

    /**
     * Create an instance of {@link ValidaHoraResponse }
     * 
     */
    public ValidaHoraResponse createValidaHoraResponse() {
        return new ValidaHoraResponse();
    }

    /**
     * Create an instance of {@link ValidaNum }
     * 
     */
    public ValidaNum createValidaNum() {
        return new ValidaNum();
    }

    /**
     * Create an instance of {@link ValidaNumResponse }
     * 
     */
    public ValidaNumResponse createValidaNumResponse() {
        return new ValidaNumResponse();
    }

    /**
     * Create an instance of {@link ValidaPraia }
     * 
     */
    public ValidaPraia createValidaPraia() {
        return new ValidaPraia();
    }

    /**
     * Create an instance of {@link ValidaPraiaResponse }
     * 
     */
    public ValidaPraiaResponse createValidaPraiaResponse() {
        return new ValidaPraiaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncCancelar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FuncCancelar }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "funcCancelar")
    public JAXBElement<FuncCancelar> createFuncCancelar(FuncCancelar value) {
        return new JAXBElement<FuncCancelar>(_FuncCancelar_QNAME, FuncCancelar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncCancelarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FuncCancelarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "funcCancelarResponse")
    public JAXBElement<FuncCancelarResponse> createFuncCancelarResponse(FuncCancelarResponse value) {
        return new JAXBElement<FuncCancelarResponse>(_FuncCancelarResponse_QNAME, FuncCancelarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncListar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FuncListar }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "funcListar")
    public JAXBElement<FuncListar> createFuncListar(FuncListar value) {
        return new JAXBElement<FuncListar>(_FuncListar_QNAME, FuncListar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncListarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FuncListarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "funcListarResponse")
    public JAXBElement<FuncListarResponse> createFuncListarResponse(FuncListarResponse value) {
        return new JAXBElement<FuncListarResponse>(_FuncListarResponse_QNAME, FuncListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncReservar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FuncReservar }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "funcReservar")
    public JAXBElement<FuncReservar> createFuncReservar(FuncReservar value) {
        return new JAXBElement<FuncReservar>(_FuncReservar_QNAME, FuncReservar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuncReservarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FuncReservarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "funcReservarResponse")
    public JAXBElement<FuncReservarResponse> createFuncReservarResponse(FuncReservarResponse value) {
        return new JAXBElement<FuncReservarResponse>(_FuncReservarResponse_QNAME, FuncReservarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaHora }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaHora }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "valida_hora")
    public JAXBElement<ValidaHora> createValidaHora(ValidaHora value) {
        return new JAXBElement<ValidaHora>(_ValidaHora_QNAME, ValidaHora.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaHoraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaHoraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "valida_horaResponse")
    public JAXBElement<ValidaHoraResponse> createValidaHoraResponse(ValidaHoraResponse value) {
        return new JAXBElement<ValidaHoraResponse>(_ValidaHoraResponse_QNAME, ValidaHoraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaNum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaNum }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "valida_num")
    public JAXBElement<ValidaNum> createValidaNum(ValidaNum value) {
        return new JAXBElement<ValidaNum>(_ValidaNum_QNAME, ValidaNum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaNumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaNumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "valida_numResponse")
    public JAXBElement<ValidaNumResponse> createValidaNumResponse(ValidaNumResponse value) {
        return new JAXBElement<ValidaNumResponse>(_ValidaNumResponse_QNAME, ValidaNumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaPraia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaPraia }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "valida_praia")
    public JAXBElement<ValidaPraia> createValidaPraia(ValidaPraia value) {
        return new JAXBElement<ValidaPraia>(_ValidaPraia_QNAME, ValidaPraia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaPraiaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaPraiaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "valida_praiaResponse")
    public JAXBElement<ValidaPraiaResponse> createValidaPraiaResponse(ValidaPraiaResponse value) {
        return new JAXBElement<ValidaPraiaResponse>(_ValidaPraiaResponse_QNAME, ValidaPraiaResponse.class, null, value);
    }

}
