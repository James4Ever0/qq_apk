package com.tencent.component.network.module.common.dns;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicRequestId
{
  private static AtomicRequestId jdField_a_of_type_ComTencentComponentNetworkModuleCommonDnsAtomicRequestId = null;
  private static AtomicInteger jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger = new AtomicInteger(100);
  
  public static AtomicRequestId a()
  {
    try
    {
      if (jdField_a_of_type_ComTencentComponentNetworkModuleCommonDnsAtomicRequestId == null) {
        jdField_a_of_type_ComTencentComponentNetworkModuleCommonDnsAtomicRequestId = new AtomicRequestId();
      }
      AtomicRequestId localAtomicRequestId = jdField_a_of_type_ComTencentComponentNetworkModuleCommonDnsAtomicRequestId;
      return localAtomicRequestId;
    }
    finally {}
  }
  
  public int a()
  {
    try
    {
      int j = jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.getAndIncrement();
      int i = j;
      if (j >= 65535)
      {
        jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger = new AtomicInteger(100);
        i = jdField_a_of_type_JavaUtilConcurrentAtomicAtomicInteger.getAndIncrement();
      }
      return i;
    }
    finally {}
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes3.jar
 * Qualified Name:     com.tencent.component.network.module.common.dns.AtomicRequestId
 * JD-Core Version:    0.7.0.1
 */