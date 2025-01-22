package study.viradonojiraya._legacy.days.day5.enumeration.domain;

import study.viradonojiraya._legacy.days.day5.enumeration.domain.enums.ClientType;

public class Client {
    private String name;
    private ClientType clientType;

    public Client(String name, ClientType clientType) {
        this.name = name;
        this.clientType = clientType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }
}
