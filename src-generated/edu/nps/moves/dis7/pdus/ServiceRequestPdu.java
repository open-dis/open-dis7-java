/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.5.5 Communicate information associated with one entity requesting a service from another.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class ServiceRequestPdu extends LogisticsFamilyPdu implements Serializable
{
   /** Entity that is requesting service (see 6.2.28), Section 7.4.2 */
   protected EntityID  requestingEntityID = new EntityID(); 

   /** Entity that is providing the service (see 6.2.28), Section 7.4.2 */
   protected EntityID  servicingEntityID = new EntityID(); 

   /** Type of service requested, Section 7.4.2 uid 63 */
   protected ServiceRequestServiceTypeRequested serviceTypeRequested = ServiceRequestServiceTypeRequested.values()[0];

   /** How many requested, Section 7.4.2 */
   protected byte  numberOfSupplyTypes;

   /** padding1 is an undescribed parameter... */
   protected short  padding1 = (short)0;

   /** supplies is an undescribed parameter... */
   protected List< SupplyQuantity > supplies = new ArrayList< SupplyQuantity >();
 

/** Constructor */
 public ServiceRequestPdu()
 {
    setPduType( DISPDUType.SERVICE_REQUEST );
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += requestingEntityID.getMarshalledSize();
   marshalSize += servicingEntityID.getMarshalledSize();
   marshalSize += serviceTypeRequested.getMarshalledSize();
   marshalSize += 1;  // numberOfSupplyTypes
   marshalSize += 2;  // padding1
   for(int idx=0; idx < supplies.size(); idx++)
   {
        SupplyQuantity listElement = supplies.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link ServiceRequestPdu#requestingEntityID}
  * @param pRequestingEntityID new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setRequestingEntityID(EntityID pRequestingEntityID)
{
    requestingEntityID = pRequestingEntityID;
    return this;
}

/** Getter for {@link ServiceRequestPdu#requestingEntityID}
  * @return value of interest */
public EntityID getRequestingEntityID()
{
    return requestingEntityID; 
}

/** Setter for {@link ServiceRequestPdu#servicingEntityID}
  * @param pServicingEntityID new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setServicingEntityID(EntityID pServicingEntityID)
{
    servicingEntityID = pServicingEntityID;
    return this;
}

/** Getter for {@link ServiceRequestPdu#servicingEntityID}
  * @return value of interest */
public EntityID getServicingEntityID()
{
    return servicingEntityID; 
}

/** Setter for {@link ServiceRequestPdu#serviceTypeRequested}
  * @param pServiceTypeRequested new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setServiceTypeRequested(ServiceRequestServiceTypeRequested pServiceTypeRequested)
{
    serviceTypeRequested = pServiceTypeRequested;
    return this;
}

/** Getter for {@link ServiceRequestPdu#serviceTypeRequested}
  * @return value of interest */
public ServiceRequestServiceTypeRequested getServiceTypeRequested()
{
    return serviceTypeRequested; 
}

/** Setter for {@link ServiceRequestPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setPadding1(short pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link ServiceRequestPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setPadding1(int pPadding1){
    padding1 = (short) pPadding1;
    return this;
}

/** Getter for {@link ServiceRequestPdu#padding1}
  * @return value of interest */
public short getPadding1()
{
    return padding1; 
}

/** Setter for {@link ServiceRequestPdu#supplies}
  * @param pSupplies new value of interest
  * @return same object to permit progressive setters */
public ServiceRequestPdu setSupplies(List<SupplyQuantity> pSupplies)
{
    supplies = pSupplies;
    return this;
}

/** Getter for {@link ServiceRequestPdu#supplies}
  * @return value of interest */
public List<SupplyQuantity> getSupplies()
{
    return supplies; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       requestingEntityID.marshal(dos);
       servicingEntityID.marshal(dos);
       serviceTypeRequested.marshal(dos);
       dos.writeByte(supplies.size());
       dos.writeShort(padding1);

       for(int idx = 0; idx < supplies.size(); idx++)
       {
            SupplyQuantity aSupplyQuantity = supplies.get(idx);
            aSupplyQuantity.marshal(dos);
       }

    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Deserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += requestingEntityID.unmarshal(dis);
        uPosition += servicingEntityID.unmarshal(dis);
        serviceTypeRequested = ServiceRequestServiceTypeRequested.unmarshalEnum(dis);
        uPosition += serviceTypeRequested.getMarshalledSize();
        numberOfSupplyTypes = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding1 = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < numberOfSupplyTypes; idx++)
        {
            SupplyQuantity anX = new SupplyQuantity();
            uPosition += anX.unmarshal(dis);
            supplies.add(anX);
        }

    }
    catch(Exception e)
    { 
      System.err.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if byteBuffer is too small
 * @throws java.nio.ReadOnlyBufferException if byteBuffer is read only
 * @see java.nio.ByteBuffer
 * @param byteBuffer The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   requestingEntityID.marshal(byteBuffer);
   servicingEntityID.marshal(byteBuffer);
   serviceTypeRequested.marshal(byteBuffer);
   byteBuffer.put( (byte)supplies.size());
   byteBuffer.putShort( (short)padding1);

   for(int idx = 0; idx < supplies.size(); idx++)
   {
        SupplyQuantity aSupplyQuantity = supplies.get(idx);
        aSupplyQuantity.marshal(byteBuffer);
   }

}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    requestingEntityID.unmarshal(byteBuffer);
    servicingEntityID.unmarshal(byteBuffer);
    serviceTypeRequested = ServiceRequestServiceTypeRequested.unmarshalEnum(byteBuffer);
    numberOfSupplyTypes = (byte)(byteBuffer.get() & 0xFF);
    padding1 = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < numberOfSupplyTypes; idx++)
    {
    SupplyQuantity anX = new SupplyQuantity();
    anX.unmarshal(byteBuffer);
    supplies.add(anX);
    }

    return getMarshalledSize();
}

 /*
  * Override of default equals method.  Calls equalsImpl() for content comparison.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final ServiceRequestPdu rhs = (ServiceRequestPdu)obj;

     if( ! (requestingEntityID.equals( rhs.requestingEntityID) )) ivarsEqual = false;
     if( ! (servicingEntityID.equals( rhs.servicingEntityID) )) ivarsEqual = false;
     if( ! (serviceTypeRequested == rhs.serviceTypeRequested)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;

     for(int idx = 0; idx < supplies.size(); idx++)
        if( ! ( supplies.get(idx).equals(rhs.supplies.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" requestingEntityID: ").append(requestingEntityID).append("\n");
    sb.append(" servicingEntityID: ").append(servicingEntityID).append("\n");
    sb.append(" serviceTypeRequested: ").append(serviceTypeRequested).append("\n");
    sb.append(" padding1: ").append(padding1).append("\n");
    sb.append(" supplies: ").append("\n");
    supplies.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
