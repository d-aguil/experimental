package experimental.resource;
import experimental.service.RecetaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

@Path("/prompt")
public class PromptResource {

    @Inject RecetaService recetaService;

    @GET
    @Path("/receta/{ingrediente}")
    public Response getReceta(@PathParam("ingrediente") String ingrediente) {

        String receta = recetaService.getReceta(ingrediente);

        return Response.ok(receta).build();
    }

}
