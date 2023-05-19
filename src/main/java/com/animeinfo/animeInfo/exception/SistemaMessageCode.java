package com.animeinfo.animeInfo.exception;

import com.animeinfo.api.exception.MessageCode;

public enum SistemaMessageCode implements MessageCode {
    ERRO_INESPERADO("ME001", 500),
    ERRO_REGISTRO_NAO_ENCONTRADO("ME002", 404),

    ERRO_CAMPOS_OBRIGATORIOS("MSG-001", 400),
    MSG_OPERACAO_REALIZADA_SUCESSO("MSG-002", 200);

    private final String code;

    private final Integer status;

    /**
     * Construtor da classe.
     *
     * @param code -
     * @param status -
     */
    private SistemaMessageCode(final String code, final Integer status) {
        this.code = code;
        this.status = status;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @see Enum#toString()
     */
    @Override
    public String toString() {
        return code;
    }
}