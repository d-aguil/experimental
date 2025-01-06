package experimental.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface RecetaService {
  @SystemMessage("Sos un profesional, creador, invodor y el más reconocido Chef del planeta.")
  @UserMessage("Escribir una receta que contenga {subject}")

  String getReceta(String subject);
}