package sharding.sphere.demo.plugin;

import java.util.Properties;
import org.apache.shardingsphere.encrypt.api.context.EncryptContext;
import org.apache.shardingsphere.encrypt.api.encrypt.assisted.AssistedEncryptAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class EmptyAssistedEncryptAlgorithm
        implements AssistedEncryptAlgorithm<Object, String> {

    private static final Logger logger =
            LoggerFactory.getLogger(EmptyAssistedEncryptAlgorithm.class);

    @Override
    public void init(final Properties props) {}

    @Override
    public String encrypt(final Object plainValue, final EncryptContext encryptContext) {
        logger.info("plainValue: {}", plainValue);
        return String.valueOf(plainValue);
    }

    @Override
    public String getType() {
        return "EMPTY_ASSIST";
    }
}
