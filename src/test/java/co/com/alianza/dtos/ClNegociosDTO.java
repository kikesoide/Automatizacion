package co.com.alianza.dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DAO que contiene la información de la entidad ClNegociosDto que se transmite
 * por los servicios REST. Solo se transmiten los atributos simples, es decir,
 * se omiten aquellos atributos que definen relaciones con otras entidades.
 * 
 * @author GeneradorCRUD
 */
public class ClNegociosDTO implements Serializable{	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal nCodnegocio;

	private BigDecimal nCodcalificacion;
	
	private BigDecimal cCodTiponegocio;
	
	private BigDecimal nCodagencia;
	
	private BigDecimal nCodtipofid;
	
	private String cNombre;
	
	private String cCodigo;
	
	private String nEstado;
	
	private String nDocpropuesta;
	
	private String cNotaria;
	
	private Date fInicio;
	
	private String cDescripcion;
	
	private String cNombreCampo;
	private Boolean isAprobar;
	private Boolean isModificar;
	private Boolean isDevolver;
	private Boolean isRechazar ;
	private String campo;
	//------------------------------------RQ2512------------------------------
	@JsonProperty("negoRsubC")
	private String negoRsub;
	//------------------------------------------------------------------------
	
	
	//RQ2484
	private String negoObcod;
	
	private String negoGcod;

	private String negoTirn;
	
	private String negoFfin;

	private String negoEemi;
	
	private String negoFgar;

	private String negoAgar;
	
	private BigDecimal negoTtvi;
	
	//------------------------------------RQ2854------------------------------
		
	private String negoNean;
	private String negoIdec;
	private String negoNoec;
	private String negoNuco;
		
	
	//------------------------------------------------------------------------
	
	//------------------------------------RQ2854------------------------------
	/**
	 * @return the negoNeam
	 */
	public String getNegoNean() {
		return negoNean;
	}
	/**
	 * @param negoNeam the negoNeam to set
	 */
	public void setNegoNean(String negoNean) {
		this.negoNean = negoNean;
	}
	/**
	 * @return the negoIdec
	 */
	public String getNegoIdec() {
		return negoIdec;
	}
	/**
	 * @param negoIdec the negoIdec to set
	 */
	public void setNegoIdec(String negoIdec) {
		this.negoIdec = negoIdec;
	}
	/**
	 * @return the negoNoec
	 */
	public String getNegoNoec() {
		return negoNoec;
	}
	/**
	 * @param negoNoec the negoNoec to set
	 */
	public void setNegoNoec(String negoNoec) {
		this.negoNoec = negoNoec;
	}
	/**
	 * @return the negoNuco
	 */
	public String getNegoNuco() {
		return negoNuco;
	}
	/**
	 * @param negoNuco the negoNuco to set
	 */
	public void setNegoNuco(String negoNuco) {
		this.negoNuco = negoNuco;
	}
	
	
	//------------------------------------------------------------------------
	
	/**
	 * @return the negoObcod
	 */
	public String getNegoObcod() {
		return negoObcod;
	}
	
	/**
	 * @param negoObcod the negoObcod to set
	 */
	public void setNegoObcod(String negoObcod) {
		this.negoObcod = negoObcod;
	}
	/**
	 * @return the negoGcod
	 */
	public String getNegoGcod() {
		return negoGcod;
	}
	/**
	 * @param negoGcod the negoGcod to set
	 */
	public void setNegoGcod(String negoGcod) {
		this.negoGcod = negoGcod;
	}
	/**
	 * @return the negoTirn
	 */
	public String getNegoTirn() {
		return negoTirn;
	}
	/**
	 * @param negoTirn the negoTirn to set
	 */
	public void setNegoTirn(String negoTirn) {
		this.negoTirn = negoTirn;
	}
	/**
	 * @return the negoFfin
	 */
	public String getNegoFfin() {
		return negoFfin;
	}
	/**
	 * @param negoFfin the negoFfin to set
	 */
	public void setNegoFfin(String negoFfin) {
		this.negoFfin = negoFfin;
	}
	/**
	 * @return the negoEemi
	 */
	public String getNegoEemi() {
		return negoEemi;
	}
	/**
	 * @param negoEemi the negoEemi to set
	 */
	public void setNegoEemi(String negoEemi) {
		this.negoEemi = negoEemi;
	}
	/**
	 * @return the negoFgar
	 */
	public String getNegoFgar() {
		return negoFgar;
	}
	/**
	 * @param negoFgar the negoFgar to set
	 */
	public void setNegoFgar(String negoFgar) {
		this.negoFgar = negoFgar;
	}
	/**
	 * @return the negoAgar
	 */
	public String getNegoAgar() {
		return negoAgar;
	}
	/**
	 * @param negoAgar the negoAgar to set
	 */
	public void setNegoAgar(String negoAgar) {
		this.negoAgar = negoAgar;
	}
	@JsonProperty("isAprobar")
	public Boolean getIsAprobar() {
		return isAprobar;
	}
	
	//------------------------------------RQ2512------------------------------
	/**
	 * @return the negoRsub
	 */
	public String getNegoRsub() {
		return negoRsub;
	}
	/**
	 * @param negoRsub the negoRsub to set
	 */
	public void setNegoRsub(String negoRsub) {
		this.negoRsub = negoRsub;
	}
	//------------------------------------------------------------------------
	
	@JsonProperty("isAprobar")
	public void setIsAprobar(Boolean isAprobar) {
		this.isAprobar = isAprobar;
	}
	@JsonProperty("isModificar")
	public Boolean getIsModificar() {
		return isModificar;
	}
	@JsonProperty("isModificar")
	public void setIsModificar(Boolean isModificar) {
		this.isModificar = isModificar;
	}
	@JsonProperty("isDevolver")
	public Boolean getIsDevolver() {
		return isDevolver;
	}
	@JsonProperty("isDevolver")
	public void setIsDevolver(Boolean isDevolver) {
		this.isDevolver = isDevolver;
	}
	@JsonProperty("isRechazar")
	public Boolean getIsRechazar() {
		return isRechazar;
	}
	@JsonProperty("isRechazar")
	public void setIsRechazar(Boolean isRechazar) {
		this.isRechazar = isRechazar;
	}

	
	@JsonProperty("cNombreCampo")
	public String getcNombreCampo() {
		return cNombreCampo;
	}
	
	@JsonProperty("cNombreCampo")
	public void setcNombreCampo(String cNombreCampo) {
		this.cNombreCampo = cNombreCampo;
	}

	@JsonProperty("cObservacion")
	public String getcObservacion() {
		return cObservacion;
	}

	@JsonProperty("cObservacion")
	public void setcObservacion(String cObservacion) {
		this.cObservacion = cObservacion;
	}

	@JsonProperty("cEstado")
	public Character getcEstado() {
		return cEstado;
	}

	@JsonProperty("cEstado")
	public void setcEstado(Character cEstado) {
		this.cEstado = cEstado;
	}

	@JsonProperty("nCodNegocioAut")
	public BigDecimal getnCodNegocioAut() {
		return nCodNegocioAut;
	}

	@JsonProperty("nCodNegocioAut")
	public void setnCodNegocioAut(BigDecimal nCodNegocioAut) {
		this.nCodNegocioAut = nCodNegocioAut;
	}

	@JsonProperty("tabla")
	public String getTabla() {
		return tabla;
	}

	@JsonProperty("tabla")
	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

	@JsonProperty("nUltimoNivel")
	public BigDecimal getnUltimoNivel() {
		return nUltimoNivel;
	}

	@JsonProperty("nUltimoNivel")
	public void setnUltimoNivel(BigDecimal nUltimoNivel) {
		this.nUltimoNivel = nUltimoNivel;
	}

	@JsonProperty("cUsuarioUltNiv")
	public String getcUsuarioUltNiv() {
		return cUsuarioUltNiv;
	}
	
	@JsonProperty("cUsuarioUltNiv")
	public void setcUsuarioUltNiv(String cUsuarioUltNiv) {
		this.cUsuarioUltNiv = cUsuarioUltNiv;
	}

	private String cObservacion;
	
	private Character cEstado;
	
	private BigDecimal nCodNegocioAut;
	
	private String tabla;
	
	private BigDecimal nUltimoNivel;
	
	private String cUsuarioUltNiv;
	
	
	@JsonProperty("cDescripcion")
	public String getcDescripcion() {
		return cDescripcion;
	}

	@JsonProperty("cDescripcion")
	public void setcDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "GMT-5") 
	private Date fConstitucion;
	
	private Date fContrato;
	
	private Date fVigencia;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "GMT-5") 
	private Date fVencimiento;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "GMT-5") 
	private Date fFinalizacion;
	
	private BigDecimal nPeriodicidadinformes;
	
	private BigDecimal nRolcomercial;
	
	private String cComercial;
	
	private BigDecimal nUsrContabilidad;
	
	private Date fActualizacion;
	
	private String nUsuario;
	
	private BigDecimal nCoddivision;
	
	private BigDecimal nFormaJuridica;
	
	private BigDecimal nTipofondo;
	
	private String cCtasCorrientes;
	
	private String cNumEscritura;
	
	private String cProcesoJuridico;
	
	private String cNumFondo;
	
	private BigDecimal nClasificComN1;
	
	private BigDecimal nClasificComN2;
	
	private BigDecimal nClasificContN1;
	
	private BigDecimal nClasificContN2;
	
	private String cResumenEjecutivo;
	
	private String bAsigMinTareas;
	
	private String cResumenEjecutivo2;
	
	private String cResumenEjecutivo3;
	
	private String cResumenEjecutivo4;
	
	private String cRolcargue;
	
	private String cPorcentajeunidad;
	
	private String cManejaunidad;
	
	private BigDecimal cValorPU;
	
	private Date fCreacion;
	
	private Date fActuaResumenEjecutivo;
	
	private String cReportaCifin;
	
	private BigDecimal nPorcentrtefuente;
	
	private String cFondoGiro;
	
	private String cCobracostos;
	
	private String cHayerroresengiros;
	
	private BigDecimal nEstado1;
	
	private BigDecimal nEstado2;
	
	private Date fUltimocierre;
	
	private String cCodtipoBalance;
	
	private String cProductividad;
	
	private String cCalificacion;
	
	private String cPeriodoproductiv;
	
	private BigDecimal nComisPromedio;
	
	private BigDecimal cMesesPromedio;
	
	private String cDecisionProspecto;
	
	private String cQuienAutorizoProspecto;
	
	private Date fAutizacionProspecto;
	
	private String cDirectorOperativo;
	
	private String cAuxiliar;
	
	private String cCargueMasivo;
	
	private BigDecimal nCodper;
	
	private String cAdmrecpub;
	
	private String cPardirindest;
	
	private String cClaobj;
	
	private String cEmisor;
	
	private String cRepcongra;
	
	private String cRfdife;
	
	private String cNif;
	
	private String cManejaunidadSubcuenta;
	
	private String negoInte;
	
	@JsonProperty("nCodnegocio")
	public BigDecimal getNCodnegocio(){
		return this.nCodnegocio;
	}
	
	@JsonProperty("nCodnegocio")
	public void setNCodnegocio(BigDecimal nCodnegocio){
		this.nCodnegocio = nCodnegocio;
	}
	
	@JsonProperty("nCodcalificacion")
	public BigDecimal getNCodcalificacion(){
		return this.nCodcalificacion;
	}
	
	@JsonProperty("nCodcalificacion")
	public void setNCodcalificacion(BigDecimal nCodcalificacion){
		this.nCodcalificacion = nCodcalificacion;
	}
		
	@JsonProperty("cCodTiponegocio")
	public BigDecimal getCCodTiponegocio(){
		return this.cCodTiponegocio;
	}
	
	@JsonProperty("cCodTiponegocio")
	public void setCCodTiponegocio(BigDecimal cCodTiponegocio){
		this.cCodTiponegocio = cCodTiponegocio;
	}
		
	@JsonProperty("nCodagencia")
	public BigDecimal getNCodagencia(){
		return this.nCodagencia;
	}
	
	@JsonProperty("nCodagencia")
	public void setNCodagencia(BigDecimal nCodagencia){
		this.nCodagencia = nCodagencia;
	}
		
	@JsonProperty("nCodtipofid")
	public BigDecimal getNCodtipofid(){
		return this.nCodtipofid;
	}
	
	@JsonProperty("nCodtipofid")
	public void setNCodtipofid(BigDecimal nCodtipofid){
		this.nCodtipofid = nCodtipofid;
	}
		
	@JsonProperty("cNombre")
	public String getCNombre(){
		return this.cNombre;
	}
	
	@JsonProperty("cNombre")
	public void setCNombre(String cNombre){
		this.cNombre = cNombre;
	}
		
	@JsonProperty("cCodigo")
	public String getCCodigo(){
		return this.cCodigo;
	}
	
	@JsonProperty("cCodigo")
	public void setCCodigo(String cCodigo){
		this.cCodigo = cCodigo;
	}
		
	@JsonProperty("nEstado")
	public String getNEstado(){
		return this.nEstado;
	}
	
	@JsonProperty("nEstado")
	public void setNEstado(String nEstado){
		this.nEstado = nEstado;
	}
		
	@JsonProperty("nDocpropuesta")
	public String getNDocpropuesta(){
		return this.nDocpropuesta;
	}
	
	@JsonProperty("nDocpropuesta")
	public void setNDocpropuesta(String nDocpropuesta){
		this.nDocpropuesta = nDocpropuesta;
	}
		
	@JsonProperty("cNotaria")
	public String getCNotaria(){
		return this.cNotaria;
	}
	
	@JsonProperty("cNotaria")
	public void setCNotaria(String cNotaria){
		this.cNotaria = cNotaria;
	}
		
	@JsonProperty("fInicio")
	public Date getFInicio(){
		return this.fInicio;
	}
	
	@JsonProperty("fInicio")
	public void setFInicio(Date fInicio){
		this.fInicio = fInicio;
	}
		
	@JsonProperty("fConstitucion")
	public Date getFConstitucion(){
		return this.fConstitucion;
	}
	
	@JsonProperty("fConstitucion")
	public void setFConstitucion(Date fConstitucion){
		this.fConstitucion = fConstitucion;
	}
		
	@JsonProperty("fContrato")
	public Date getFContrato(){
		return this.fContrato;
	}
	
	@JsonProperty("fContrato")
	public void setFContrato(Date fContrato){
		this.fContrato = fContrato;
	}
		
	@JsonProperty("fVigencia")
	public Date getFVigencia(){
		return this.fVigencia;
	}
	
	@JsonProperty("fVigencia")
	public void setFVigencia(Date fVigencia){
		this.fVigencia = fVigencia;
	}
		
	@JsonProperty("fVencimiento")
	public Date getFVencimiento(){
		return this.fVencimiento;
	}
	
	@JsonProperty("fVencimiento")
	public void setFVencimiento(Date fVencimiento){
		this.fVencimiento = fVencimiento;
	}
		
	@JsonProperty("fFinalizacion")
	public Date getFFinalizacion(){
		return this.fFinalizacion;
	}
	
	@JsonProperty("fFinalizacion")
	public void setFFinalizacion(Date fFinalizacion){
		this.fFinalizacion = fFinalizacion;
	}
		
	@JsonProperty("nPeriodicidadinformes")
	public BigDecimal getNPeriodicidadinformes(){
		return this.nPeriodicidadinformes;
	}
	
	@JsonProperty("nPeriodicidadinformes")
	public void setNPeriodicidadinformes(BigDecimal nPeriodicidadinformes){
		this.nPeriodicidadinformes = nPeriodicidadinformes;
	}
		
	@JsonProperty("nRolcomercial")
	public BigDecimal getNRolcomercial(){
		return this.nRolcomercial;
	}
	
	@JsonProperty("nRolcomercial")
	public void setNRolcomercial(BigDecimal nRolcomercial){
		this.nRolcomercial = nRolcomercial;
	}
		
	@JsonProperty("cComercial")
	public String getCComercial(){
		return this.cComercial;
	}
	
	@JsonProperty("cComercial")
	public void setCComercial(String cComercial){
		this.cComercial = cComercial;
	}
		
	@JsonProperty("nUsrContabilidad")
	public BigDecimal getNUsrContabilidad(){
		return this.nUsrContabilidad;
	}
	
	@JsonProperty("nUsrContabilidad")
	public void setNUsrContabilidad(BigDecimal nUsrContabilidad){
		this.nUsrContabilidad = nUsrContabilidad;
	}
		
	@JsonProperty("fActualizacion")
	public Date getFActualizacion(){
		return this.fActualizacion;
	}
	
	@JsonProperty("fActualizacion")
	public void setFActualizacion(Date fActualizacion){
		this.fActualizacion = fActualizacion;
	}
		
	@JsonProperty("nUsuario")
	public String getNUsuario(){
		return this.nUsuario;
	}
	
	@JsonProperty("nUsuario")
	public void setNUsuario(String nUsuario){
		this.nUsuario = nUsuario;
	}
		
	@JsonProperty("nCoddivision")
	public BigDecimal getNCoddivision(){
		return this.nCoddivision;
	}
	
	@JsonProperty("nCoddivision")
	public void setNCoddivision(BigDecimal nCoddivision){
		this.nCoddivision = nCoddivision;
	}
		
	@JsonProperty("nFormaJuridica")
	public BigDecimal getNFormaJuridica(){
		return this.nFormaJuridica;
	}
	
	@JsonProperty("nFormaJuridica")
	public void setNFormaJuridica(BigDecimal nFormaJuridica){
		this.nFormaJuridica = nFormaJuridica;
	}
		
	@JsonProperty("nTipofondo")
	public BigDecimal getNTipofondo(){
		return this.nTipofondo;
	}
	
	@JsonProperty("nTipofondo")
	public void setNTipofondo(BigDecimal nTipofondo){
		this.nTipofondo = nTipofondo;
	}
		
	@JsonProperty("cCtasCorrientes")
	public String getCCtasCorrientes(){
		return this.cCtasCorrientes;
	}
	
	@JsonProperty("cCtasCorrientes")
	public void setCCtasCorrientes(String cCtasCorrientes){
		this.cCtasCorrientes = cCtasCorrientes;
	}
		
	@JsonProperty("cNumEscritura")
	public String getCNumEscritura(){
		return this.cNumEscritura;
	}
	
	@JsonProperty("cNumEscritura")
	public void setCNumEscritura(String cNumEscritura){
		this.cNumEscritura = cNumEscritura;
	}
		
	@JsonProperty("cProcesoJuridico")
	public String getCProcesoJuridico(){
		return this.cProcesoJuridico;
	}
	
	@JsonProperty("cProcesoJuridico")
	public void setCProcesoJuridico(String cProcesoJuridico){
		this.cProcesoJuridico = cProcesoJuridico;
	}
		
	@JsonProperty("cNumFondo")
	public String getCNumFondo(){
		return this.cNumFondo;
	}
	
	@JsonProperty("cNumFondo")
	public void setCNumFondo(String cNumFondo){
		this.cNumFondo = cNumFondo;
	}
		
	@JsonProperty("nClasificComN1")
	public BigDecimal getNClasificComN1(){
		return this.nClasificComN1;
	}
	
	@JsonProperty("nClasificComN1")
	public void setNClasificComN1(BigDecimal nClasificComN1){
		this.nClasificComN1 = nClasificComN1;
	}
		
	@JsonProperty("nClasificComN2")
	public BigDecimal getNClasificComN2(){
		return this.nClasificComN2;
	}
	
	@JsonProperty("nClasificComN2")
	public void setNClasificComN2(BigDecimal nClasificComN2){
		this.nClasificComN2 = nClasificComN2;
	}
		
	@JsonProperty("nClasificContN1")
	public BigDecimal getNClasificContN1(){
		return this.nClasificContN1;
	}
	
	@JsonProperty("nClasificContN1")
	public void setNClasificContN1(BigDecimal nClasificContN1){
		this.nClasificContN1 = nClasificContN1;
	}
		
	@JsonProperty("nClasificContN2")
	public BigDecimal getNClasificContN2(){
		return this.nClasificContN2;
	}
	
	@JsonProperty("nClasificContN2")
	public void setNClasificContN2(BigDecimal nClasificContN2){
		this.nClasificContN2 = nClasificContN2;
	}
		
	@JsonProperty("cResumenEjecutivo")
	public String getCResumenEjecutivo(){
		return this.cResumenEjecutivo;
	}
	
	@JsonProperty("cResumenEjecutivo")
	public void setCResumenEjecutivo(String cResumenEjecutivo){
		this.cResumenEjecutivo = cResumenEjecutivo;
	}
		
	@JsonProperty("bAsigMinTareas")
	public String getBAsigMinTareas(){
		return this.bAsigMinTareas;
	}
	
	@JsonProperty("bAsigMinTareas")
	public void setBAsigMinTareas(String bAsigMinTareas){
		this.bAsigMinTareas = bAsigMinTareas;
	}
		
	@JsonProperty("cResumenEjecutivo2")
	public String getCResumenEjecutivo2(){
		return this.cResumenEjecutivo2;
	}
	
	@JsonProperty("cResumenEjecutivo2")
	public void setCResumenEjecutivo2(String cResumenEjecutivo2){
		this.cResumenEjecutivo2 = cResumenEjecutivo2;
	}
		
	@JsonProperty("cResumenEjecutivo3")
	public String getCResumenEjecutivo3(){
		return this.cResumenEjecutivo3;
	}
	
	@JsonProperty("cResumenEjecutivo3")
	public void setCResumenEjecutivo3(String cResumenEjecutivo3){
		this.cResumenEjecutivo3 = cResumenEjecutivo3;
	}
		
	@JsonProperty("cResumenEjecutivo4")
	public String getCResumenEjecutivo4(){
		return this.cResumenEjecutivo4;
	}
	
	@JsonProperty("cResumenEjecutivo4")
	public void setCResumenEjecutivo4(String cResumenEjecutivo4){
		this.cResumenEjecutivo4 = cResumenEjecutivo4;
	}
		
	@JsonProperty("cRolcargue")
	public String getCRolcargue(){
		return this.cRolcargue;
	}
	
	@JsonProperty("cRolcargue")
	public void setCRolcargue(String cRolcargue){
		this.cRolcargue = cRolcargue;
	}
		
	@JsonProperty("cPorcentajeunidad")
	public String getCPorcentajeunidad(){
		return this.cPorcentajeunidad;
	}
	
	@JsonProperty("cPorcentajeunidad")
	public void setCPorcentajeunidad(String cPorcentajeunidad){
		this.cPorcentajeunidad = cPorcentajeunidad;
	}
		
	@JsonProperty("cManejaunidad")
	public String getCManejaunidad(){
		return this.cManejaunidad;
	}
	
	@JsonProperty("cManejaunidad")
	public void setCManejaunidad(String cManejaunidad){
		this.cManejaunidad = cManejaunidad;
	}
	
	@JsonProperty("cManejaunidadSubcuenta")
	public String getCManejaunidadSubcuenta(){
		return this.cManejaunidadSubcuenta;
	}
	
	@JsonProperty("cManejaunidadSubcuenta")
	public void setCManejaunidadSubcuenta(String cManejaunidadSubcuenta){
		this.cManejaunidadSubcuenta = cManejaunidadSubcuenta;
	}
		
	@JsonProperty("cValorPU")
	public BigDecimal getCValorPU(){
		return this.cValorPU;
	}
	
	@JsonProperty("cValorPU")
	public void setCValorPU(BigDecimal cValorPU){
		this.cValorPU = cValorPU;
	}
		
	@JsonProperty("fCreacion")
	public Date getFCreacion(){
		return this.fCreacion;
	}
	
	@JsonProperty("fCreacion")
	public void setFCreacion(Date fCreacion){
		this.fCreacion = fCreacion;
	}
		
	@JsonProperty("fActuaResumenEjecutivo")
	public Date getFActuaResumenEjecutivo(){
		return this.fActuaResumenEjecutivo;
	}
	
	@JsonProperty("fActuaResumenEjecutivo")
	public void setFActuaResumenEjecutivo(Date fActuaResumenEjecutivo){
		this.fActuaResumenEjecutivo = fActuaResumenEjecutivo;
	}
		
	@JsonProperty("cReportaCifin")
	public String getCReportaCifin(){
		return this.cReportaCifin;
	}
	
	@JsonProperty("cReportaCifin")
	public void setCReportaCifin(String cReportaCifin){
		this.cReportaCifin = cReportaCifin;
	}
		
	@JsonProperty("nPorcentrtefuente")
	public BigDecimal getNPorcentrtefuente(){
		return this.nPorcentrtefuente;
	}
	
	@JsonProperty("nPorcentrtefuente")
	public void setNPorcentrtefuente(BigDecimal nPorcentrtefuente){
		this.nPorcentrtefuente = nPorcentrtefuente;
	}
		
	@JsonProperty("cFondoGiro")
	public String getCFondoGiro(){
		return this.cFondoGiro;
	}
	
	@JsonProperty("cFondoGiro")
	public void setCFondoGiro(String cFondoGiro){
		this.cFondoGiro = cFondoGiro;
	}
		
	@JsonProperty("cCobracostos")
	public String getCCobracostos(){
		return this.cCobracostos;
	}
	
	@JsonProperty("cCobracostos")
	public void setCCobracostos(String cCobracostos){
		this.cCobracostos = cCobracostos;
	}
		
	@JsonProperty("cHayerroresengiros")
	public String getCHayerroresengiros(){
		return this.cHayerroresengiros;
	}
	
	@JsonProperty("cHayerroresengiros")
	public void setCHayerroresengiros(String cHayerroresengiros){
		this.cHayerroresengiros = cHayerroresengiros;
	}
		
	@JsonProperty("nEstado1")
	public BigDecimal getNEstado1(){
		return this.nEstado1;
	}
	
	@JsonProperty("nEstado1")
	public void setNEstado1(BigDecimal nEstado1){
		this.nEstado1 = nEstado1;
	}
		
	@JsonProperty("nEstado2")
	public BigDecimal getNEstado2(){
		return this.nEstado2;
	}
	
	@JsonProperty("nEstado2")
	public void setNEstado2(BigDecimal nEstado2){
		this.nEstado2 = nEstado2;
	}
		
	@JsonProperty("fUltimocierre")
	public Date getFUltimocierre(){
		return this.fUltimocierre;
	}
	
	@JsonProperty("fUltimocierre")
	public void setFUltimocierre(Date fUltimocierre){
		this.fUltimocierre = fUltimocierre;
	}
		
	@JsonProperty("cCodtipoBalance")
	public String getCCodtipoBalance(){
		return this.cCodtipoBalance;
	}
	
	@JsonProperty("cCodtipoBalance")
	public void setCCodtipoBalance(String cCodtipoBalance){
		this.cCodtipoBalance = cCodtipoBalance;
	}
		
	@JsonProperty("cProductividad")
	public String getCProductividad(){
		return this.cProductividad;
	}
	
	@JsonProperty("cProductividad")
	public void setCProductividad(String cProductividad){
		this.cProductividad = cProductividad;
	}
		
	@JsonProperty("cCalificacion")
	public String getCCalificacion(){
		return this.cCalificacion;
	}
	
	@JsonProperty("cCalificacion")
	public void setCCalificacion(String cCalificacion){
		this.cCalificacion = cCalificacion;
	}
		
	@JsonProperty("cPeriodoproductiv")
	public String getCPeriodoproductiv(){
		return this.cPeriodoproductiv;
	}
	
	@JsonProperty("cPeriodoproductiv")
	public void setCPeriodoproductiv(String cPeriodoproductiv){
		this.cPeriodoproductiv = cPeriodoproductiv;
	}
		
	@JsonProperty("nComisPromedio")
	public BigDecimal getNComisPromedio(){
		return this.nComisPromedio;
	}
	
	@JsonProperty("nComisPromedio")
	public void setNComisPromedio(BigDecimal nComisPromedio){
		this.nComisPromedio = nComisPromedio;
	}
		
	@JsonProperty("cMesesPromedio")
	public BigDecimal getCMesesPromedio(){
		return this.cMesesPromedio;
	}
	
	@JsonProperty("cMesesPromedio")
	public void setCMesesPromedio(BigDecimal cMesesPromedio){
		this.cMesesPromedio = cMesesPromedio;
	}
		
	@JsonProperty("cDecisionProspecto")
	public String getCDecisionProspecto(){
		return this.cDecisionProspecto;
	}
	
	@JsonProperty("cDecisionProspecto")
	public void setCDecisionProspecto(String cDecisionProspecto){
		this.cDecisionProspecto = cDecisionProspecto;
	}
		
	@JsonProperty("cQuienAutorizoProspecto")
	public String getCQuienAutorizoProspecto(){
		return this.cQuienAutorizoProspecto;
	}
	
	@JsonProperty("cQuienAutorizoProspecto")
	public void setCQuienAutorizoProspecto(String cQuienAutorizoProspecto){
		this.cQuienAutorizoProspecto = cQuienAutorizoProspecto;
	}
		
	@JsonProperty("fAutizacionProspecto")
	public Date getFAutizacionProspecto(){
		return this.fAutizacionProspecto;
	}
	
	@JsonProperty("fAutizacionProspecto")
	public void setFAutizacionProspecto(Date fAutizacionProspecto){
		this.fAutizacionProspecto = fAutizacionProspecto;
	}
		
	@JsonProperty("cDirectorOperativo")
	public String getCDirectorOperativo(){
		return this.cDirectorOperativo;
	}
	
	@JsonProperty("cDirectorOperativo")
	public void setCDirectorOperativo(String cDirectorOperativo){
		this.cDirectorOperativo = cDirectorOperativo;
	}
		
	@JsonProperty("cAuxiliar")
	public String getCAuxiliar(){
		return this.cAuxiliar;
	}
	
	@JsonProperty("cAuxiliar")
	public void setCAuxiliar(String cAuxiliar){
		this.cAuxiliar = cAuxiliar;
	}
		
	@JsonProperty("cCargueMasivo")
	public String getCCargueMasivo(){
		return this.cCargueMasivo;
	}
	
	@JsonProperty("cCargueMasivo")
	public void setCCargueMasivo(String cCargueMasivo){
		this.cCargueMasivo = cCargueMasivo;
	}
		
	@JsonProperty("nCodper")
	public BigDecimal getNCodper(){
		return this.nCodper;
	}
	
	@JsonProperty("nCodper")
	public void setNCodper(BigDecimal nCodper){
		this.nCodper = nCodper;
	}
		
	@JsonProperty("cAdmrecpub")
	public String getCAdmrecpub(){
		return this.cAdmrecpub;
	}
	
	@JsonProperty("cAdmrecpub")
	public void setCAdmrecpub(String cAdmrecpub){
		this.cAdmrecpub = cAdmrecpub;
	}
		
	@JsonProperty("cPardirindest")
	public String getCPardirindest(){
		return this.cPardirindest;
	}
	
	@JsonProperty("cPardirindest")
	public void setCPardirindest(String cPardirindest){
		this.cPardirindest = cPardirindest;
	}
		
	@JsonProperty("cClaobj")
	public String getCClaobj(){
		return this.cClaobj;
	}
	
	@JsonProperty("cClaobj")
	public void setCClaobj(String cClaobj){
		this.cClaobj = cClaobj;
	}
		
	@JsonProperty("cEmisor")
	public String getCEmisor(){
		return this.cEmisor;
	}
	
	@JsonProperty("cEmisor")
	public void setCEmisor(String cEmisor){
		this.cEmisor = cEmisor;
	}
		
	@JsonProperty("cRepcongra")
	public String getCRepcongra(){
		return this.cRepcongra;
	}
	
	@JsonProperty("cRepcongra")
	public void setCRepcongra(String cRepcongra){
		this.cRepcongra = cRepcongra;
	}
		
	@JsonProperty("cRfdife")
	public String getCRfdife(){
		return this.cRfdife;
	}
	
	@JsonProperty("cRfdife")
	public void setCRfdife(String cRfdife){
		this.cRfdife = cRfdife;
	}
		
	@JsonProperty("cNif")
	public String getCNif(){
		return this.cNif;
	}
	
	@JsonProperty("cNif")
	public void setCNif(String cNif){
		this.cNif = cNif;
	}
		
	
	@JsonProperty("campo")
    public String getCampo() {
		return campo;
	}
	@JsonProperty("campo")
	public void setCampo(String campo) {
		this.campo = campo;
	}
	
	/**
	 * @return the negoTtvi
	 */
	public BigDecimal getNegoTtvi() {
		return negoTtvi;
	}
	/**
	 * @param negoTtvi the negoTtvi to set
	 */
	public void setNegoTtvi(BigDecimal negoTtvi) {
		this.negoTtvi = negoTtvi;
	}
	
	public String getNegoInte() {
		return negoInte;
	}
	public void setNegoInte(String negoInte) {
		this.negoInte = negoInte;
	}
	/**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int hash = 3;
        
        hash = 37 * hash + Objects.hashCode(this.nCodnegocio);        
        hash = 37 * hash + Objects.hashCode(this.nCodcalificacion);
        hash = 37 * hash + Objects.hashCode(this.cCodTiponegocio);
        hash = 37 * hash + Objects.hashCode(this.nCodagencia);
        hash = 37 * hash + Objects.hashCode(this.nCodtipofid);
        hash = 37 * hash + Objects.hashCode(this.cNombre);
        hash = 37 * hash + Objects.hashCode(this.cCodigo);
        hash = 37 * hash + Objects.hashCode(this.nEstado);
        hash = 37 * hash + Objects.hashCode(this.nDocpropuesta);
        hash = 37 * hash + Objects.hashCode(this.cNotaria);
        hash = 37 * hash + Objects.hashCode(this.fInicio);
        hash = 37 * hash + Objects.hashCode(this.fConstitucion);
        hash = 37 * hash + Objects.hashCode(this.fContrato);
        hash = 37 * hash + Objects.hashCode(this.fVigencia);
        hash = 37 * hash + Objects.hashCode(this.fVencimiento);
        hash = 37 * hash + Objects.hashCode(this.fFinalizacion);
        hash = 37 * hash + Objects.hashCode(this.nPeriodicidadinformes);
        hash = 37 * hash + Objects.hashCode(this.nRolcomercial);
        hash = 37 * hash + Objects.hashCode(this.cComercial);
        hash = 37 * hash + Objects.hashCode(this.nUsrContabilidad);
        hash = 37 * hash + Objects.hashCode(this.fActualizacion);
        hash = 37 * hash + Objects.hashCode(this.nUsuario);
        hash = 37 * hash + Objects.hashCode(this.nCoddivision);
        hash = 37 * hash + Objects.hashCode(this.nFormaJuridica);
        hash = 37 * hash + Objects.hashCode(this.nTipofondo);
        hash = 37 * hash + Objects.hashCode(this.cCtasCorrientes);
        hash = 37 * hash + Objects.hashCode(this.cNumEscritura);
        hash = 37 * hash + Objects.hashCode(this.cProcesoJuridico);
        hash = 37 * hash + Objects.hashCode(this.cNumFondo);
        hash = 37 * hash + Objects.hashCode(this.nClasificComN1);
        hash = 37 * hash + Objects.hashCode(this.nClasificComN2);
        hash = 37 * hash + Objects.hashCode(this.nClasificContN1);
        hash = 37 * hash + Objects.hashCode(this.nClasificContN2);
        hash = 37 * hash + Objects.hashCode(this.cResumenEjecutivo);
        hash = 37 * hash + Objects.hashCode(this.bAsigMinTareas);
        hash = 37 * hash + Objects.hashCode(this.cResumenEjecutivo2);
        hash = 37 * hash + Objects.hashCode(this.cResumenEjecutivo3);
        hash = 37 * hash + Objects.hashCode(this.cResumenEjecutivo4);
        hash = 37 * hash + Objects.hashCode(this.cRolcargue);
        hash = 37 * hash + Objects.hashCode(this.cPorcentajeunidad);
        hash = 37 * hash + Objects.hashCode(this.cManejaunidad);
        hash = 37 * hash + Objects.hashCode(this.cValorPU);
        hash = 37 * hash + Objects.hashCode(this.fCreacion);
        hash = 37 * hash + Objects.hashCode(this.fActuaResumenEjecutivo);
        hash = 37 * hash + Objects.hashCode(this.cReportaCifin);
        hash = 37 * hash + Objects.hashCode(this.nPorcentrtefuente);
        hash = 37 * hash + Objects.hashCode(this.cFondoGiro);
        hash = 37 * hash + Objects.hashCode(this.cCobracostos);
        hash = 37 * hash + Objects.hashCode(this.cHayerroresengiros);
        hash = 37 * hash + Objects.hashCode(this.nEstado1);
        hash = 37 * hash + Objects.hashCode(this.nEstado2);
        hash = 37 * hash + Objects.hashCode(this.fUltimocierre);
        hash = 37 * hash + Objects.hashCode(this.cCodtipoBalance);
        hash = 37 * hash + Objects.hashCode(this.cProductividad);
        hash = 37 * hash + Objects.hashCode(this.cCalificacion);
        hash = 37 * hash + Objects.hashCode(this.cPeriodoproductiv);
        hash = 37 * hash + Objects.hashCode(this.nComisPromedio);
        hash = 37 * hash + Objects.hashCode(this.cMesesPromedio);
        hash = 37 * hash + Objects.hashCode(this.cDecisionProspecto);
        hash = 37 * hash + Objects.hashCode(this.cQuienAutorizoProspecto);
        hash = 37 * hash + Objects.hashCode(this.fAutizacionProspecto);
        hash = 37 * hash + Objects.hashCode(this.cDirectorOperativo);
        hash = 37 * hash + Objects.hashCode(this.cAuxiliar);
        hash = 37 * hash + Objects.hashCode(this.cCargueMasivo);
        hash = 37 * hash + Objects.hashCode(this.nCodper);
        hash = 37 * hash + Objects.hashCode(this.cAdmrecpub);
        hash = 37 * hash + Objects.hashCode(this.cPardirindest);
        hash = 37 * hash + Objects.hashCode(this.cClaobj);
        hash = 37 * hash + Objects.hashCode(this.cEmisor);
        hash = 37 * hash + Objects.hashCode(this.cRepcongra);
        hash = 37 * hash + Objects.hashCode(this.cRfdife);
        hash = 37 * hash + Objects.hashCode(this.cNif);
        hash = 37 * hash + Objects.hashCode(this.campo);
      //------------------------------------RQ2512------------------------------
        hash = 37 * hash + Objects.hashCode(this.negoRsub);
      //------------------------------------------------------------------------
        
        hash = 37 * hash + Objects.hashCode(this.negoObcod);
        hash = 37 * hash + Objects.hashCode(this.negoGcod);
        hash = 37 * hash + Objects.hashCode(this.negoFgar);
        hash = 37 * hash + Objects.hashCode(this.negoFfin);
        hash = 37 * hash + Objects.hashCode(this.negoEemi);
        hash = 37 * hash + Objects.hashCode(this.negoAgar);
        hash = 37 * hash + Objects.hashCode(this.negoTirn);
        hash = 37 * hash + Objects.hashCode(this.cManejaunidadSubcuenta);
        hash = 37 * hash + Objects.hashCode(this.negoInte);
        
        return hash;
    }

	/**
     * Valida la igualdad de la instancia de la entidad ClNegociosDto que se pasa
     * como parámetro comprobando que comparten los mismos valores en cada uno
     * de sus atributos. Solo se tienen en cuenta los atributos simples, es
     * decir, se omiten aquellos que definen una relación con otra tabla.
     *
     * @param obj Instancia de la categoría a comprobar
     * iguales.
     * @return Verdadero si esta instancia y la que se pasan como parámetros son
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClNegociosDTO other = (ClNegociosDTO) obj;
                
        if (!Objects.equals(this.nCodnegocio, other.nCodnegocio)) {
            return false;
        }
        
        if (!Objects.equals(this.nCodcalificacion, other.nCodcalificacion)) {
            return false;
        }
        
        if (!Objects.equals(this.cCodTiponegocio, other.cCodTiponegocio)) {
            return false;
        }
        
        if (!Objects.equals(this.nCodagencia, other.nCodagencia)) {
            return false;
        }
        
        if (!Objects.equals(this.nCodtipofid, other.nCodtipofid)) {
            return false;
        }
        
        if (!Objects.equals(this.cNombre, other.cNombre)) {
            return false;
        }
        
        if (!Objects.equals(this.cCodigo, other.cCodigo)) {
            return false;
        }
        
        if (!Objects.equals(this.nEstado, other.nEstado)) {
            return false;
        }
        
        if (!Objects.equals(this.nDocpropuesta, other.nDocpropuesta)) {
            return false;
        }
        
        if (!Objects.equals(this.cNotaria, other.cNotaria)) {
            return false;
        }
        
        if (!Objects.equals(this.fInicio, other.fInicio)) {
            return false;
        }
        
        if (!Objects.equals(this.fConstitucion, other.fConstitucion)) {
            return false;
        }
        
        if (!Objects.equals(this.fContrato, other.fContrato)) {
            return false;
        }
        
        if (!Objects.equals(this.fVigencia, other.fVigencia)) {
            return false;
        }
        
        if (!Objects.equals(this.fVencimiento, other.fVencimiento)) {
            return false;
        }
        
        if (!Objects.equals(this.fFinalizacion, other.fFinalizacion)) {
            return false;
        }
        
        if (!Objects.equals(this.nPeriodicidadinformes, other.nPeriodicidadinformes)) {
            return false;
        }
        
        if (!Objects.equals(this.nRolcomercial, other.nRolcomercial)) {
            return false;
        }
        
        if (!Objects.equals(this.cComercial, other.cComercial)) {
            return false;
        }
        
        if (!Objects.equals(this.nUsrContabilidad, other.nUsrContabilidad)) {
            return false;
        }
        
        if (!Objects.equals(this.fActualizacion, other.fActualizacion)) {
            return false;
        }
        
        if (!Objects.equals(this.nUsuario, other.nUsuario)) {
            return false;
        }
        
        if (!Objects.equals(this.nCoddivision, other.nCoddivision)) {
            return false;
        }
        
        if (!Objects.equals(this.nFormaJuridica, other.nFormaJuridica)) {
            return false;
        }
        
        if (!Objects.equals(this.nTipofondo, other.nTipofondo)) {
            return false;
        }
        
        if (!Objects.equals(this.cCtasCorrientes, other.cCtasCorrientes)) {
            return false;
        }
        
        if (!Objects.equals(this.cNumEscritura, other.cNumEscritura)) {
            return false;
        }
        
        if (!Objects.equals(this.cProcesoJuridico, other.cProcesoJuridico)) {
            return false;
        }
        
        if (!Objects.equals(this.cNumFondo, other.cNumFondo)) {
            return false;
        }
        
        if (!Objects.equals(this.nClasificComN1, other.nClasificComN1)) {
            return false;
        }
        
        if (!Objects.equals(this.nClasificComN2, other.nClasificComN2)) {
            return false;
        }
        
        if (!Objects.equals(this.nClasificContN1, other.nClasificContN1)) {
            return false;
        }
        
        if (!Objects.equals(this.nClasificContN2, other.nClasificContN2)) {
            return false;
        }
        
        if (!Objects.equals(this.cResumenEjecutivo, other.cResumenEjecutivo)) {
            return false;
        }
        
        if (!Objects.equals(this.bAsigMinTareas, other.bAsigMinTareas)) {
            return false;
        }
        
        if (!Objects.equals(this.cResumenEjecutivo2, other.cResumenEjecutivo2)) {
            return false;
        }
        
        if (!Objects.equals(this.cResumenEjecutivo3, other.cResumenEjecutivo3)) {
            return false;
        }
        
        if (!Objects.equals(this.cResumenEjecutivo4, other.cResumenEjecutivo4)) {
            return false;
        }
        
        if (!Objects.equals(this.cRolcargue, other.cRolcargue)) {
            return false;
        }
        
        if (!Objects.equals(this.cPorcentajeunidad, other.cPorcentajeunidad)) {
            return false;
        }
        
        if (!Objects.equals(this.cManejaunidad, other.cManejaunidad)) {
            return false;
        }
        
        if (!Objects.equals(this.cValorPU, other.cValorPU)) {
            return false;
        }
        
        if (!Objects.equals(this.fCreacion, other.fCreacion)) {
            return false;
        }
        
        if (!Objects.equals(this.fActuaResumenEjecutivo, other.fActuaResumenEjecutivo)) {
            return false;
        }
        
        if (!Objects.equals(this.cReportaCifin, other.cReportaCifin)) {
            return false;
        }
        
        if (!Objects.equals(this.nPorcentrtefuente, other.nPorcentrtefuente)) {
            return false;
        }
        
        if (!Objects.equals(this.cFondoGiro, other.cFondoGiro)) {
            return false;
        }
        
        if (!Objects.equals(this.cCobracostos, other.cCobracostos)) {
            return false;
        }
        
        if (!Objects.equals(this.cHayerroresengiros, other.cHayerroresengiros)) {
            return false;
        }
        
        if (!Objects.equals(this.nEstado1, other.nEstado1)) {
            return false;
        }
        
        if (!Objects.equals(this.nEstado2, other.nEstado2)) {
            return false;
        }
        
        if (!Objects.equals(this.fUltimocierre, other.fUltimocierre)) {
            return false;
        }
        
        if (!Objects.equals(this.cCodtipoBalance, other.cCodtipoBalance)) {
            return false;
        }
        
        if (!Objects.equals(this.cProductividad, other.cProductividad)) {
            return false;
        }
        
        if (!Objects.equals(this.cCalificacion, other.cCalificacion)) {
            return false;
        }
        
        if (!Objects.equals(this.cPeriodoproductiv, other.cPeriodoproductiv)) {
            return false;
        }
        
        if (!Objects.equals(this.nComisPromedio, other.nComisPromedio)) {
            return false;
        }
        
        if (!Objects.equals(this.cMesesPromedio, other.cMesesPromedio)) {
            return false;
        }
        
        if (!Objects.equals(this.cDecisionProspecto, other.cDecisionProspecto)) {
            return false;
        }
        
        if (!Objects.equals(this.cQuienAutorizoProspecto, other.cQuienAutorizoProspecto)) {
            return false;
        }
        
        if (!Objects.equals(this.fAutizacionProspecto, other.fAutizacionProspecto)) {
            return false;
        }
        
        if (!Objects.equals(this.cDirectorOperativo, other.cDirectorOperativo)) {
            return false;
        }
        
        if (!Objects.equals(this.cAuxiliar, other.cAuxiliar)) {
            return false;
        }
        
        if (!Objects.equals(this.cCargueMasivo, other.cCargueMasivo)) {
            return false;
        }
        
        if (!Objects.equals(this.nCodper, other.nCodper)) {
            return false;
        }
        
        if (!Objects.equals(this.cAdmrecpub, other.cAdmrecpub)) {
            return false;
        }
        
        if (!Objects.equals(this.cPardirindest, other.cPardirindest)) {
            return false;
        }
        
        if (!Objects.equals(this.cClaobj, other.cClaobj)) {
            return false;
        }
        
        if (!Objects.equals(this.cEmisor, other.cEmisor)) {
            return false;
        }
        
        if (!Objects.equals(this.cRepcongra, other.cRepcongra)) {
            return false;
        }
        
        if (!Objects.equals(this.cRfdife, other.cRfdife)) {
            return false;
        }
        if (!Objects.equals(this.campo, other.campo)) {
            return false;
        }
        
        if (!Objects.equals(this.cManejaunidadSubcuenta, other.cManejaunidadSubcuenta)) {
            return false;
        }
        
        if (!Objects.equals(this.cManejaunidadSubcuenta, other.cManejaunidadSubcuenta)) {
            return false;
        }
        
        if (!Objects.equals(this.cNif, other.cNif)) {
            return false;
        }
        if (!Objects.equals(this.negoObcod, other.negoObcod)) {
            return false;
        }
        if (!Objects.equals(this.negoGcod, other.negoGcod)) {
            return false;
        }
        if (!Objects.equals(this.negoFgar, other.negoFgar)) {
            return false;
        }
        if (!Objects.equals(this.negoFfin, other.negoFfin)) {
            return false;
        }
        if (!Objects.equals(this.negoEemi, other.negoEemi)) {
            return false;
        }
        if (!Objects.equals(this.negoAgar, other.negoAgar)) {
            return false;
        }
        if (!Objects.equals(this.negoInte, other.negoInte)) {
            return false;
        }
        //------------------------------------RQ2512------------------------------
        if (!Objects.equals(this.negoTirn, other.negoTirn)) {
            return false;
        }
        return Objects.equals(this.negoRsub, other.negoRsub);
      //------------------------------------------------------------------------
        
                
    }
    public Collection transformarColeccion(Collection<Object[]> resultados) {
		List<ClNegociosDTO> datosNegocio = new ArrayList<>();
		for (Object[] resultado : resultados)
			datosNegocio.add(transformarResultado(resultado));
		return datosNegocio;
	}
	
	


	public ClNegociosDTO transformarResultado(Object[] resultado) {
		ClNegociosDTO datosNegocio = new ClNegociosDTO();
		datosNegocio.setNCodnegocio(resultado[0] != null ? (BigDecimal) resultado[0] : null);
		datosNegocio.setCCodigo(resultado[1] != null ? resultado[1].toString().trim() : null);
		datosNegocio.setCNombre(resultado[2] != null ? resultado[2].toString() : null);
		return datosNegocio;
	}
	
	public List<ClNegociosDTO> transformarColeccionLista(Collection<Object[]> resultados) {
		List<ClNegociosDTO> datosNegocio = new ArrayList<>();
		for (Object[] resultado : resultados)
			datosNegocio.add(transformarResultadoLista(resultado));
		return datosNegocio;
	}

	public ClNegociosDTO transformarResultadoLista(Object[] resultado) {
		ClNegociosDTO datosNegocio = new ClNegociosDTO();
		datosNegocio.setNCodnegocio(resultado[0] != null ? (BigDecimal)resultado[0] : null);		
		datosNegocio.setCNombre(resultado[1] != null ? resultado[1].toString() : null);
		return datosNegocio;
	}

	
	/**
	 * Retorna objeto con resultado consulta otrosi pendiente
	 * @param resultados
	 * @return
	 */
	public List<ClNegociosDTO> transformarColeccionOtroSiPend(Collection<Object[]> resultados) {
		List<ClNegociosDTO> datosNegocio = new ArrayList<>();
		for (Object[] resultado : resultados)
			datosNegocio.add(transformarResultadoOtroSiPend(resultado));
		return datosNegocio;
	} 
	
	/**
	 * Retorna objeto con resultado consulta otrosi pendiente
	 * @param resultado
	 * @return
	 */
	public ClNegociosDTO transformarResultadoOtroSiPend(Object[] resultado) {
		ClNegociosDTO datosNegocio = new ClNegociosDTO();
		datosNegocio.setCCodigo(resultado[0] != null ? (String)resultado[0] : null);		
		datosNegocio.setCNombre(resultado[1] != null ? resultado[1].toString() : null);
		datosNegocio.setcNombreCampo(resultado[2] != null ? (String)resultado[2] : null);
		datosNegocio.setcDescripcion(resultado[3] != null ? (String)resultado[3] : null);
		datosNegocio.setcEstado(resultado[4] != null ? (Character)resultado[4] : null);
		datosNegocio.setnCodNegocioAut(resultado[5] != null ? (BigDecimal)resultado[5] : null);
		datosNegocio.setcObservacion(resultado[6] != null ? (String)resultado[6] : null);
		datosNegocio.setNCodnegocio(resultado[7] != null ? (BigDecimal)resultado[7] : null);
		datosNegocio.setTabla(resultado[8] != null ? (String)resultado[8] : null);
		datosNegocio.setnUltimoNivel(resultado[9] != null ? (BigDecimal)resultado[9] : null);
		datosNegocio.setcUsuarioUltNiv(resultado[10] != null ? (String)resultado[10] : null);
		datosNegocio.setFActualizacion(resultado[11] != null ? (Date)resultado[11] : null);	
		
		return datosNegocio;
	}
	
} 

