package com.vcom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
public class WebConfig implements WebFluxConfigurer {

//    @Override
//    public void configureArgumentResolvers(ArgumentResolverConfigurer configurer) {
//        configurer.addCustomResolver(new HandlerMethodArgumentResolver() {
//            @Override
//            public boolean supportsParameter(MethodParameter parameter) {
//                return false;
//            }
//
//            @Override
//            public Mono<Object> resolveArgument(MethodParameter parameter, BindingContext bindingContext, ServerWebExchange exchange) {
//                return null;
//            }
//        });
//    }

//    @Override
//    public void configureHttpMessageCodecs(ServerCodecConfigurer configurer) {
//
//        configurer.customCodecs().register(new HttpMessageWriter() {
//            @Override
//            public List<MediaType> getWritableMediaTypes() {
//                return null;
//            }
//
//            @Override
//            public boolean canWrite(ResolvableType elementType, MediaType mediaType) {
//                return false;
//            }
//
//            @Override
//            public Mono<Void> write(Publisher inputStream, ResolvableType elementType, MediaType mediaType, ReactiveHttpOutputMessage message, Map hints) {
//                return null;
//            }
//        });
//    }

//    @Override
//    public void configurePathMatching(PathMatchConfigurer configurer) {
//        configurer
//                .setUseCaseSensitiveMatch(true)
//                .setUseTrailingSlashMatch(false)
//                .addPathPrefix("/api",
//                        HandlerTypePredicate.forAnnotation(RestController.class));
//    }
}

