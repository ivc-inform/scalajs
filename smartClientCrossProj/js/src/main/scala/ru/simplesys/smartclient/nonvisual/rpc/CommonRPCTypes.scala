package ru.simplesys
package smartclient
package nonvisual
package rpc

import scala.scalajs.js
import macrojs._
import common._
import cmntypes.SCProps

sealed trait HttpMethod extends SimpleStringEnum

object HttpMethod extends SimpleStringEnumObj[HttpMethod] {
  //@inline implicit def httpMethodToJS(df: HttpMethod): js.Any = df.asString

  case object Post extends HttpMethod {
    override def asString: String = "POST"
  }

  case object Get extends HttpMethod {
    override def asString: String = "GET"
  }


  case object Put extends HttpMethod {
    override def asString: String = "PUT"
  }

  case object Delete extends HttpMethod {
    override def asString: String = "DELETE"
  }


  case object Head extends HttpMethod {
    override def asString: String = "HEAD"
  }

  val formatMap: Map[String, HttpMethod] = Seq(Post, Get, Put, Delete, Head).map(x => (x.asString, x))(collection.breakOut)
}

//--------------------------------------------------------------------------

sealed trait DSDataFormat extends SimpleStringEnum

object DSDataFormat extends SimpleStringEnumObj[DSDataFormat] {
  //@inline implicit def dataFormatToJS(df: DSDataFormat): js.Any = df.asString

  case object IscServer extends DSDataFormat {
    override def asString: String = "iscServer"
  }

  case object Xml extends DSDataFormat {
    override def asString: String = "xml"
  }

  case object JSon extends DSDataFormat {
    override def asString: String = "json"
  }

  case object Custom extends DSDataFormat {
    override def asString: String = "custom"
  }

  val formatMap: Map[String, DSDataFormat] = Seq(IscServer, Xml, JSon, Custom).map(x => (x.asString, x))(collection.breakOut)
}

//--------------------------------------------------------------------------


sealed trait DSProtocol extends SimpleStringEnum

object DSProtocol extends SimpleStringEnumObj[DSProtocol] {
  //@inline implicit def protocolToJS(p: DSProtocol): js.Any = p.asString

  //Data is added to the dataURL, with each property in the data becoming an HTTP parameter, eg http://service.com/search?keyword=foo
  case object GetParams extends DSProtocol {
    override def asString: String = "getParams"
  }

  //Data is POST'd to the dataURL, with each property becoming an HTTP parameter, exactly as an HTML form would submit them if it had one input field per property in the data.
  case object PostParams extends DSProtocol {
    override def asString: String = "postParams"
  }

  //Data is serialized as XML via DataSource.xmlSerialize() and POST'd as the HTTP request body with contentType "text/xml".
  case object PostXML extends DSProtocol {
    override def asString: String = "postXML"
  }

  //Data is serialized as XML via DataSource.xmlSerialize(), wrapped in a SOAP envelope, and POST'd as the HTTP request body with contentType "text/xml". Generally only used in connection with a WSDL web service.
  case object Soap extends DSProtocol {
    override def asString: String = "soap"
  }

  //dsRequest.data is assumed to be a String set up by DataSource.transformRequest() and is POST'd as the HTTP request body.
  case object PostMessage extends DSProtocol {
    override def asString: String = "postMessage"
  }

  //This setting entirely bypasses the SmartClient comm system. Instead of the DataSource sending an HTTP request to a URL, the developer is expected to implement DataSource.transformRequest() to perform their own custom logic, and then call DataSource.processResponse() to handle the results of this action.
  //This dataProtocol setting can be used to implement access to in-browser resources such as HTML5 "localStorage", native APIs available to applications packaged as native applications, or to implement the DataSource Facade pattern.
  case object ClientCustom extends DSProtocol {
    override def asString: String = "clientCustom"
  }


  val formatMap: Map[String, DSProtocol] = Seq(GetParams, PostParams, PostXML, Soap, PostMessage, ClientCustom).map(x => (x.asString, x))(collection.breakOut)
}


//--------------------------------------------------------------------------

sealed trait RPCTransport extends SimpleStringEnum

object RPCTransport extends SimpleStringEnumObj[RPCTransport] {
  //@inline implicit def protocolToJS(p: RPCTransport): js.Any = p.asString

  //Uses the XMLHttpRequest object to make the request to the server. Note that in some browsers with certain configurations, this transport may not be available. See Platform Dependencies for more information. This transport is not useful with file uploads. Cannot be used to target cross-domain URLs directly.
  case object XmlHttpRequest extends RPCTransport {
    override def asString: String = "xmlHttpRequest"
  }

  //Write a SCRIPT tag into the DOM with a SRC attribute that targets an arbitrary URL. This transport is the only one that allows direct cross-domain URL access.
  //For RPCRequest.callback to work, the server being contacted must support the ability to generate JavaScript code in the response that will call a JavaScript function generated by SmartClient. SmartClient passes the name of the function to call via a URL parameter, which can be controlled with RPCRequest.callbackParam. This callback mechanism is sometimes called the "JSONP" (JSON with Padding) approach.
  case object ScriptInclude extends RPCTransport {
    override def asString: String = "scriptInclude"
  }

  //Available with SmartClient Server only. An HTML form is dynamically assembled that targets a hidden IFRAME. This mechanism is supported on all browsers and cannot be disabled by end users.
  //If using the SmartClient Server and using Server-side data integration, the "hiddenFrame" transport is automatically used for all RPCManager and DataSource requests if the "xmlHttpRequest" transport is not available.
  //Cannot be used to target cross-domain URLs directly.
  case object HiddenFrame extends RPCTransport {
    override def asString: String = "hiddenFrame"
  }

  val formatMap: Map[String, RPCTransport] = Seq(XmlHttpRequest, ScriptInclude, HiddenFrame).map(x => (x.asString, x))(collection.breakOut)
}

//--------------------------------------------------------------------------

sealed trait DSOperationType extends SimpleStringEnum

object DSOperationType extends SimpleStringEnumObj[DSOperationType] {
  //@inline implicit def protocolToJS(p: RPCTransport): js.Any = p.asString

  //Fetch one or more records that match a set of search criteria.
  case object Fetch extends DSOperationType {
    override def asString: String = "fetch"
  }

  //Store new records
  case object Add extends DSOperationType {
    override def asString: String = "add"
  }

  //Update an existing record
  case object Update extends DSOperationType {
    override def asString: String = "update"
  }


  //Remove (delete) an existing record
  case object Remove extends DSOperationType {
    override def asString: String = "remove"
  }

  //perform some arbitrary custom logic that is not a CRUD operation. Format of the inputs and outputs is unconstrained, and the operation will be ignored for cache sync purposes by ResultSets. See DataSource.performCustomOperation().
  case object Custom extends DSOperationType {
    override def asString: String = "custom"
  }

  //Run server-side validation for "add" or "update" without actually adding or updating anything. See DataSource.validateData().
  case object Validate extends DSOperationType {
    override def asString: String = "validate"
  }

  //Retrieve a file stored in a binary field in a DataSource record, and allow the browser to choose whether to view it directly or prompt the user to save. See Binary Fields.
  case object ViewFile extends DSOperationType {
    override def asString: String = "viewFile"
  }

  //Like "viewFile", but the HTTP header Content-Disposition is used to suggest that the browser show a save dialog. See Binary Fields.
  case object DownloadFile extends DSOperationType {
    override def asString: String = "downloadFile"
  }

  //Upload formatted client data and export it to Excel, XML and other formats. Used automatically by exportClientData() and cannot be used directly. Usable only with the SmartClient server framework.
  case object ClientExport extends DSOperationType {
    override def asString: String = "clientExport"
  }


  //Use the DataSource as a source for files. Used automatically by DataSource.getFile(), and would not normally be used directly. Usable only with the SmartClient server framework.
  case object GetFile extends DSOperationType {
    override def asString: String = "getFile"
  }

  //Use the DataSource as a source for files. Used automatically by DataSource.hasFile(), and would not normally be used directly. Usable only with the SmartClient server framework.
  case object HasFile extends DSOperationType {
    override def asString: String = "hasFile"
  }

  //Use the DataSource as a source for files. Used automatically by DataSource.listFiles(), and would not normally be used directly. Usable only with the SmartClient server framework.
  case object ListFiles extends DSOperationType {
    override def asString: String = "listFiles"
  }

  //Use the DataSource as a source for files. Used automatically by DataSource.removeFile(), and would not normally be used directly. Usable only with the SmartClient server framework.
  case object RemoveFile extends DSOperationType {
    override def asString: String = "removeFile"
  }

  //Use the DataSource as a source for files. Used automatically by DataSource.saveFile(), and would not normally be used directly. Usable only with the SmartClient server framework.
  case object SaveFile extends DSOperationType {
    override def asString: String = "saveFile"
  }

  //Use the DataSource as a source for files. Used automatically by DataSource.renameFile(), and would not normally be used directly. Usable only with the SmartClient server framework.
  case object RenameFile extends DSOperationType {
    override def asString: String = "renameFile"
  }


  val formatMap: Map[String, DSOperationType] = Seq(Fetch, Add, Update, Remove, Custom, Validate, ViewFile, DownloadFile, ClientExport, GetFile, HasFile, ListFiles, RemoveFile, SaveFile, RenameFile).map(x => (x.asString, x))(collection.breakOut)
}
