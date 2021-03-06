/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.5.6 Communicate the offer of supplies by a supplying entity to a receiving entity.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class ResupplyOfferPdu extends LogisticsFamilyPdu implements Serializable
{
   /** Field identifies the Entity and respective Entity Record ID that is receiving service (see 6.2.28), Section 7.4.3 */
   protected EntityID  receivingEntityID = new EntityID(); 

   /** Identifies the Entity and respective Entity ID Record that is supplying  (see 6.2.28), Section 7.4.3 */
   protected EntityID  supplyingEntityID = new EntityID(); 

   /** How many supplies types are being offered, Section 7.4.3 */
   protected byte  numberOfSupplyTypes;

   /** padding */
   protected byte  padding1 = (byte)0;

   /** padding */
   protected short  padding2 = (short)0;

   /** A Reord that Specifies the type of supply and the amount of that supply for each of the supply types in numberOfSupplyTypes (see 6.2.85), Section 7.4.3 */
   protected List< SupplyQuantity > supplies = new ArrayList< SupplyQuantity >();
 

/** Constructor */
 public ResupplyOfferPdu()
 {
    setPduType( DISPDUType.RESUPPLY_OFFER );
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
   marshalSize += receivingEntityID.getMarshalledSize();
   marshalSize += supplyingEntityID.getMarshalledSize();
   marshalSize += 1;  // numberOfSupplyTypes
   marshalSize += 1;  // padding1
   marshalSize += 2;  // padding2
   for(int idx=0; idx < supplies.size(); idx++)
   {
        SupplyQuantity listElement = supplies.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link ResupplyOfferPdu#receivingEntityID}
  * @param pReceivingEntityID new value of interest
  * @return same object to permit progressive setters */
public ResupplyOfferPdu setReceivingEntityID(EntityID pReceivingEntityID)
{
    receivingEntityID = pReceivingEntityID;
    return this;
}

/** Getter for {@link ResupplyOfferPdu#receivingEntityID}
  * @return value of interest */
public EntityID getReceivingEntityID()
{
    return receivingEntityID; 
}

/** Setter for {@link ResupplyOfferPdu#supplyingEntityID}
  * @param pSupplyingEntityID new value of interest
  * @return same object to permit progressive setters */
public ResupplyOfferPdu setSupplyingEntityID(EntityID pSupplyingEntityID)
{
    supplyingEntityID = pSupplyingEntityID;
    return this;
}

/** Getter for {@link ResupplyOfferPdu#supplyingEntityID}
  * @return value of interest */
public EntityID getSupplyingEntityID()
{
    return supplyingEntityID; 
}

/** Setter for {@link ResupplyOfferPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public ResupplyOfferPdu setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link ResupplyOfferPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public ResupplyOfferPdu setPadding1(int pPadding1){
    padding1 = (byte) pPadding1;
    return this;
}

/** Getter for {@link ResupplyOfferPdu#padding1}
  * @return value of interest */
public byte getPadding1()
{
    return padding1; 
}

/** Setter for {@link ResupplyOfferPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public ResupplyOfferPdu setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link ResupplyOfferPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public ResupplyOfferPdu setPadding2(int pPadding2){
    padding2 = (short) pPadding2;
    return this;
}

/** Getter for {@link ResupplyOfferPdu#padding2}
  * @return value of interest */
public short getPadding2()
{
    return padding2; 
}

/** Setter for {@link ResupplyOfferPdu#supplies}
  * @param pSupplies new value of interest
  * @return same object to permit progressive setters */
public ResupplyOfferPdu setSupplies(List<SupplyQuantity> pSupplies)
{
    supplies = pSupplies;
    return this;
}

/** Getter for {@link ResupplyOfferPdu#supplies}
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
       receivingEntityID.marshal(dos);
       supplyingEntityID.marshal(dos);
       dos.writeByte(supplies.size());
       dos.writeByte(padding1);
       dos.writeShort(padding2);

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
        uPosition += receivingEntityID.unmarshal(dis);
        uPosition += supplyingEntityID.unmarshal(dis);
        numberOfSupplyTypes = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding2 = (short)dis.readUnsignedShort();
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
   receivingEntityID.marshal(byteBuffer);
   supplyingEntityID.marshal(byteBuffer);
   byteBuffer.put( (byte)supplies.size());
   byteBuffer.put( (byte)padding1);
   byteBuffer.putShort( (short)padding2);

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

    receivingEntityID.unmarshal(byteBuffer);
    supplyingEntityID.unmarshal(byteBuffer);
    numberOfSupplyTypes = (byte)(byteBuffer.get() & 0xFF);
    padding1 = (byte)(byteBuffer.get() & 0xFF);
    padding2 = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final ResupplyOfferPdu rhs = (ResupplyOfferPdu)obj;

     if( ! (receivingEntityID.equals( rhs.receivingEntityID) )) ivarsEqual = false;
     if( ! (supplyingEntityID.equals( rhs.supplyingEntityID) )) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;

     for(int idx = 0; idx < supplies.size(); idx++)
        if( ! ( supplies.get(idx).equals(rhs.supplies.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" receivingEntityID: ").append(receivingEntityID).append("\n");
    sb.append(" supplyingEntityID: ").append(supplyingEntityID).append("\n");
    sb.append(" padding1: ").append(padding1).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");
    sb.append(" supplies: ").append("\n");
    supplies.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
