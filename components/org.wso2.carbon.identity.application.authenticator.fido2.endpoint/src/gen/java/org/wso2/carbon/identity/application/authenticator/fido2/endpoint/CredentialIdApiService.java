package org.wso2.carbon.identity.application.authenticator.fido2.endpoint;

import org.wso2.carbon.identity.application.authenticator.fido2.endpoint.*;
import org.wso2.carbon.identity.application.authenticator.fido2.endpoint.dto.*;

import org.wso2.carbon.identity.application.authenticator.fido2.endpoint.dto.ErrorDTO;
import org.wso2.carbon.identity.application.authenticator.fido2.endpoint.dto.PatchRequestDTO;
import org.wso2.carbon.identity.application.authenticator.fido2.endpoint.dto.RegistrationObjectDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class CredentialIdApiService {
    public abstract Response credentialIdDelete(String credentialId);
    public abstract Response credentialIdPatch(String credentialId,PatchRequestDTO body);
}

