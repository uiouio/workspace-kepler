package com.ctfo.trackservice.dao;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import com.ctfo.trackservice.common.RedisProperties;

/*****
 * 初始化连接Redis服务
 * @author robin
 *
 */
public class RedisConnectionPool {
	/**	redis连接池	*/
	private static JedisPool jedisPool = null;
	/**	redis配置	*/
	private static RedisProperties redisProperties;
	
	/**
	 * 初始化
	 * @param redisProperties
	 */
	public static void init(RedisProperties properties) {
		redisProperties = properties;
		JedisPoolConfig jedisPoolConfig = initJedisConfig(properties);
		jedisPool = new JedisPool(jedisPoolConfig, properties.getHost(), properties.getPort(),properties.getRedisTimeout(),properties.getPwd());
	}
	
	/*****************************************
	 * <li>描        述：初始化redis配置 		</li><br>
	 * <li>时        间：2013-10-22  下午5:34:20	</li><br>
	 * <li>参数： @param maxActive
	 * <li>参数： @param maxIdle
	 * <li>参数： @param maxWait
	 * <li>参数： @return			</li><br>
	 * 
	 *****************************************/
	private static JedisPoolConfig initJedisConfig(RedisProperties redisProperties){
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();  
        // 控制一个pool最多有多少个状态为idle的jedis实例  
        jedisPoolConfig.setMaxActive(redisProperties.getMaxActive());   
        // 最大能够保持空闲状态的对象数  
        jedisPoolConfig.setMaxIdle(redisProperties.getMaxIdle());  
        // 超时时间  
        jedisPoolConfig.setMaxWait(redisProperties.getMaxWait());  
        // 在borrow一个jedis实例时，是否提前进行alidate操作；如果为true，则得到的jedis实例均是可用的；  
        jedisPoolConfig.setTestOnBorrow(true);   
        // 在还会给pool时，是否提前进行validate操作  
        jedisPoolConfig.setTestOnReturn(true);
        
        jedisPoolConfig.setTestWhileIdle(true);
        
        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(60000);
        
        return jedisPoolConfig;  
	}
	/*****************************************
	 * <li>描        述：获取Redis连接 		</li><br>
	 * <li>时        间：2013-10-22  下午5:31:30	</li><br>
	 * <li>参数： @return			</li><br>
	 * 
	 *****************************************/
	public static Jedis getJedisConnection(){
		return jedisPool.getResource();
	}
	
	/*****************************************
	 * <li>描        述：放回连接池 		</li><br>
	 * <li>时        间：2013-10-22  下午5:31:07	</li><br>
	 * <li>参数： @param jedis			</li><br>
	 * 
	 *****************************************/
	public static void returnJedisConnection(Jedis jedis){
		jedisPool.returnResource(jedis);
	}
	
	/*****************************************
	 * <li>描        述：销毁异常连接 		</li><br>
	 * <li>时        间：2013-10-22  下午5:30:41	</li><br>
	 * <li>参数： @param jedis			</li><br>
	 * 
	 *****************************************/
	public static void returnBrokenResource(Jedis jedis){
		jedisPool.returnBrokenResource(jedis);
	}
	/**
	 * 重置redis连接池 - 修复Redis缓存BUG,jedis客户端异常后，redis内部顺序会乱
	 */
	public static void reConnection(){
		synchronized (jedisPool) {
			JedisPoolConfig jedisPoolConfig = initJedisConfig(redisProperties);
			jedisPool = new JedisPool(jedisPoolConfig, redisProperties.getHost(), redisProperties.getPort(),redisProperties.getRedisTimeout(),redisProperties.getPwd());
		}
	}
	/**
	 * 重置redis连接池 - 修复Redis缓存BUG,jedis客户端异常后，redis内部顺序会乱
	 */
	public static Jedis reConnectionReturnJedis(){
		synchronized (jedisPool) {
			JedisPoolConfig jedisPoolConfig = initJedisConfig(redisProperties);
			jedisPool = new JedisPool(jedisPoolConfig, redisProperties.getHost(), redisProperties.getPort(),redisProperties.getRedisTimeout(),redisProperties.getPwd());
			return jedisPool.getResource();
		}
	}
}
