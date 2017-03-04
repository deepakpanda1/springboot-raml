package de.janosch.springbootraml.rest;

import de.janosch.springbootraml.Profil;
import de.janosch.springbootraml.rest.resource.V1ProfileResource;

import java.util.Collections;

/**
 * ProfileREST
 */
public class ProfileREST implements V1ProfileResource {

    @Override
    public GetV1ProfileResponse getV1Profile() throws Exception {
        return GetV1ProfileResponse.withJsonOK(Collections.singletonList(new Profil().withName("Testuser")));
    }

}