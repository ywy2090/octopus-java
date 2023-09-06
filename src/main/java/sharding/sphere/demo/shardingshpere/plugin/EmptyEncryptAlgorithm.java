package sharding.sphere.demo.shardingshpere.plugin;

import java.util.Properties;
import org.apache.shardingsphere.encrypt.api.context.EncryptContext;
import org.apache.shardingsphere.encrypt.api.encrypt.standard.StandardEncryptAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class EmptyEncryptAlgorithm implements StandardEncryptAlgorithm<Object, String> {

    private static final Logger logger = LoggerFactory.getLogger(EmptyEncryptAlgorithm.class);

    @Override
    public void init(Properties props) {}

    @Override
    public Object decrypt(String cipherValue, EncryptContext encryptContext) {
        logger.info("cipherValue: {}", cipherValue);
        return cipherValue;
    }

    @Override
    public String encrypt(Object plainValue, EncryptContext encryptContext) {
        logger.info("plainValue: {}", plainValue);
        return String.valueOf(plainValue);
    }

    @Override
    public String getType() {
        return "EMPTY";
    }
}
