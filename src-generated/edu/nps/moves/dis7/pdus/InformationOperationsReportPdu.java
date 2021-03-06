/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.13.4.1 Used to communicate the effects of an IO attack on one or more target entities.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class InformationOperationsReportPdu extends InformationOperationsFamilyPdu implements Serializable
{
   /**  uid 286 */
   protected IOActionIOSimulationSource ioSimSource = IOActionIOSimulationSource.values()[0];

   /** request ID uid 289 */
   protected IOReportIOReportType ioReportType = IOReportIOReportType.values()[0];

   /** padding1 is an undescribed parameter... */
   protected byte  padding1;

   /** ioAttackerID is an undescribed parameter... */
   protected EntityID  ioAttackerID = new EntityID(); 

   /** ioPrimaryTargetID is an undescribed parameter... */
   protected EntityID  ioPrimaryTargetID = new EntityID(); 

   /** padding2 is an undescribed parameter... */
   protected short  padding2;

   /** padding3 is an undescribed parameter... */
   protected short  padding3;

   /** numberOfIORecords is an undescribed parameter... */
   protected short  numberOfIORecords;

   /** ioRecords is an undescribed parameter... */
   protected List< IORecord > ioRecords = new ArrayList< IORecord >();
 

/** Constructor */
 public InformationOperationsReportPdu()
 {
    setPduType( DISPDUType.INFORMATION_OPERATIONS_REPORT );
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
   marshalSize += ioSimSource.getMarshalledSize();
   marshalSize += ioReportType.getMarshalledSize();
   marshalSize += 1;  // padding1
   marshalSize += ioAttackerID.getMarshalledSize();
   marshalSize += ioPrimaryTargetID.getMarshalledSize();
   marshalSize += 2;  // padding2
   marshalSize += 2;  // padding3
   marshalSize += 2;  // numberOfIORecords
   for(int idx=0; idx < ioRecords.size(); idx++)
   {
        IORecord listElement = ioRecords.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link InformationOperationsReportPdu#ioSimSource}
  * @param pIoSimSource new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setIoSimSource(IOActionIOSimulationSource pIoSimSource)
{
    ioSimSource = pIoSimSource;
    return this;
}

/** Getter for {@link InformationOperationsReportPdu#ioSimSource}
  * @return value of interest */
public IOActionIOSimulationSource getIoSimSource()
{
    return ioSimSource; 
}

/** Setter for {@link InformationOperationsReportPdu#ioReportType}
  * @param pIoReportType new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setIoReportType(IOReportIOReportType pIoReportType)
{
    ioReportType = pIoReportType;
    return this;
}

/** Getter for {@link InformationOperationsReportPdu#ioReportType}
  * @return value of interest */
public IOReportIOReportType getIoReportType()
{
    return ioReportType; 
}

/** Setter for {@link InformationOperationsReportPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link InformationOperationsReportPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setPadding1(int pPadding1){
    padding1 = (byte) pPadding1;
    return this;
}

/** Getter for {@link InformationOperationsReportPdu#padding1}
  * @return value of interest */
public byte getPadding1()
{
    return padding1; 
}

/** Setter for {@link InformationOperationsReportPdu#ioAttackerID}
  * @param pIoAttackerID new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setIoAttackerID(EntityID pIoAttackerID)
{
    ioAttackerID = pIoAttackerID;
    return this;
}

/** Getter for {@link InformationOperationsReportPdu#ioAttackerID}
  * @return value of interest */
public EntityID getIoAttackerID()
{
    return ioAttackerID; 
}

/** Setter for {@link InformationOperationsReportPdu#ioPrimaryTargetID}
  * @param pIoPrimaryTargetID new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setIoPrimaryTargetID(EntityID pIoPrimaryTargetID)
{
    ioPrimaryTargetID = pIoPrimaryTargetID;
    return this;
}

/** Getter for {@link InformationOperationsReportPdu#ioPrimaryTargetID}
  * @return value of interest */
public EntityID getIoPrimaryTargetID()
{
    return ioPrimaryTargetID; 
}

/** Setter for {@link InformationOperationsReportPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link InformationOperationsReportPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setPadding2(int pPadding2){
    padding2 = (short) pPadding2;
    return this;
}

/** Getter for {@link InformationOperationsReportPdu#padding2}
  * @return value of interest */
public short getPadding2()
{
    return padding2; 
}

/** Setter for {@link InformationOperationsReportPdu#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setPadding3(short pPadding3)
{
    padding3 = pPadding3;
    return this;
}
/** Utility setter for {@link InformationOperationsReportPdu#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setPadding3(int pPadding3){
    padding3 = (short) pPadding3;
    return this;
}

/** Getter for {@link InformationOperationsReportPdu#padding3}
  * @return value of interest */
public short getPadding3()
{
    return padding3; 
}

/** Setter for {@link InformationOperationsReportPdu#ioRecords}
  * @param pIoRecords new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsReportPdu setIoRecords(List<IORecord> pIoRecords)
{
    ioRecords = pIoRecords;
    return this;
}

/** Getter for {@link InformationOperationsReportPdu#ioRecords}
  * @return value of interest */
public List<IORecord> getIoRecords()
{
    return ioRecords; 
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
       ioSimSource.marshal(dos);
       ioReportType.marshal(dos);
       dos.writeByte(padding1);
       ioAttackerID.marshal(dos);
       ioPrimaryTargetID.marshal(dos);
       dos.writeShort(padding2);
       dos.writeShort(padding3);
       dos.writeShort(ioRecords.size());

       for(int idx = 0; idx < ioRecords.size(); idx++)
       {
            IORecord aIORecord = ioRecords.get(idx);
            aIORecord.marshal(dos);
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
        ioSimSource = IOActionIOSimulationSource.unmarshalEnum(dis);
        uPosition += ioSimSource.getMarshalledSize();
        ioReportType = IOReportIOReportType.unmarshalEnum(dis);
        uPosition += ioReportType.getMarshalledSize();
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += ioAttackerID.unmarshal(dis);
        uPosition += ioPrimaryTargetID.unmarshal(dis);
        padding2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        padding3 = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfIORecords = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < numberOfIORecords; idx++)
        {
            IORecord anX = new IORecord();
            uPosition += anX.unmarshal(dis);
            ioRecords.add(anX);
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
   ioSimSource.marshal(byteBuffer);
   ioReportType.marshal(byteBuffer);
   byteBuffer.put( (byte)padding1);
   ioAttackerID.marshal(byteBuffer);
   ioPrimaryTargetID.marshal(byteBuffer);
   byteBuffer.putShort( (short)padding2);
   byteBuffer.putShort( (short)padding3);
   byteBuffer.putShort( (short)ioRecords.size());

   for(int idx = 0; idx < ioRecords.size(); idx++)
   {
        IORecord aIORecord = ioRecords.get(idx);
        aIORecord.marshal(byteBuffer);
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

    ioSimSource = IOActionIOSimulationSource.unmarshalEnum(byteBuffer);
    ioReportType = IOReportIOReportType.unmarshalEnum(byteBuffer);
    padding1 = (byte)(byteBuffer.get() & 0xFF);
    ioAttackerID.unmarshal(byteBuffer);
    ioPrimaryTargetID.unmarshal(byteBuffer);
    padding2 = (short)(byteBuffer.getShort() & 0xFFFF);
    padding3 = (short)(byteBuffer.getShort() & 0xFFFF);
    numberOfIORecords = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < numberOfIORecords; idx++)
    {
    IORecord anX = new IORecord();
    anX.unmarshal(byteBuffer);
    ioRecords.add(anX);
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

     final InformationOperationsReportPdu rhs = (InformationOperationsReportPdu)obj;

     if( ! (ioSimSource == rhs.ioSimSource)) ivarsEqual = false;
     if( ! (ioReportType == rhs.ioReportType)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (ioAttackerID.equals( rhs.ioAttackerID) )) ivarsEqual = false;
     if( ! (ioPrimaryTargetID.equals( rhs.ioPrimaryTargetID) )) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
     if( ! (padding3 == rhs.padding3)) ivarsEqual = false;

     for(int idx = 0; idx < ioRecords.size(); idx++)
        if( ! ( ioRecords.get(idx).equals(rhs.ioRecords.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" ioSimSource: ").append(ioSimSource).append("\n");
    sb.append(" ioReportType: ").append(ioReportType).append("\n");
    sb.append(" padding1: ").append(padding1).append("\n");
    sb.append(" ioAttackerID: ").append(ioAttackerID).append("\n");
    sb.append(" ioPrimaryTargetID: ").append(ioPrimaryTargetID).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");
    sb.append(" padding3: ").append(padding3).append("\n");
    sb.append(" ioRecords: ").append("\n");
    ioRecords.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
