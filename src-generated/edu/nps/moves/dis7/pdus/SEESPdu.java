/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 7.6.6 Certain supplemental information on an entity’s physical state and emissions. See 5.7.7
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class SEESPdu extends DistributedEmissionsFamilyPdu implements Serializable
{
   /** Originating entity ID */
   protected EntityID  orginatingEntityID = new EntityID(); 

   /** IR Signature representation index */
   protected short  infraredSignatureRepresentationIndex;

   /** acoustic Signature representation index */
   protected short  acousticSignatureRepresentationIndex;

   /** radar cross section representation index */
   protected short  radarCrossSectionSignatureRepresentationIndex;

   /** how many propulsion systems */
   protected short  numberOfPropulsionSystems;

   /** how many vectoring nozzle systems */
   protected short  numberOfVectoringNozzleSystems;

   /** variable length list of propulsion system data */
   protected List< PropulsionSystemData > propulsionSystemData = new ArrayList< PropulsionSystemData >();
 
   /** variable length list of vectoring system data */
   protected List< VectoringNozzleSystem > vectoringSystemData = new ArrayList< VectoringNozzleSystem >();
 

/** Constructor */
 public SEESPdu()
 {
    setPduType( DISPDUType.SUPPLEMENTAL_EMISSION_ENTITY_STATE );
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
   marshalSize += orginatingEntityID.getMarshalledSize();
   marshalSize += 2;  // infraredSignatureRepresentationIndex
   marshalSize += 2;  // acousticSignatureRepresentationIndex
   marshalSize += 2;  // radarCrossSectionSignatureRepresentationIndex
   marshalSize += 2;  // numberOfPropulsionSystems
   marshalSize += 2;  // numberOfVectoringNozzleSystems
   for(int idx=0; idx < propulsionSystemData.size(); idx++)
   {
        PropulsionSystemData listElement = propulsionSystemData.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   for(int idx=0; idx < vectoringSystemData.size(); idx++)
   {
        VectoringNozzleSystem listElement = vectoringSystemData.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link SEESPdu#orginatingEntityID}
  * @param pOrginatingEntityID new value of interest
  * @return same object to permit progressive setters */
public SEESPdu setOrginatingEntityID(EntityID pOrginatingEntityID)
{
    orginatingEntityID = pOrginatingEntityID;
    return this;
}

/** Getter for {@link SEESPdu#orginatingEntityID}
  * @return value of interest */
public EntityID getOrginatingEntityID()
{
    return orginatingEntityID; 
}

/** Setter for {@link SEESPdu#infraredSignatureRepresentationIndex}
  * @param pInfraredSignatureRepresentationIndex new value of interest
  * @return same object to permit progressive setters */
public SEESPdu setInfraredSignatureRepresentationIndex(short pInfraredSignatureRepresentationIndex)
{
    infraredSignatureRepresentationIndex = pInfraredSignatureRepresentationIndex;
    return this;
}
/** Utility setter for {@link SEESPdu#infraredSignatureRepresentationIndex}
  * @param pInfraredSignatureRepresentationIndex new value of interest
  * @return same object to permit progressive setters */
public SEESPdu setInfraredSignatureRepresentationIndex(int pInfraredSignatureRepresentationIndex){
    infraredSignatureRepresentationIndex = (short) pInfraredSignatureRepresentationIndex;
    return this;
}

/** Getter for {@link SEESPdu#infraredSignatureRepresentationIndex}
  * @return value of interest */
public short getInfraredSignatureRepresentationIndex()
{
    return infraredSignatureRepresentationIndex; 
}

/** Setter for {@link SEESPdu#acousticSignatureRepresentationIndex}
  * @param pAcousticSignatureRepresentationIndex new value of interest
  * @return same object to permit progressive setters */
public SEESPdu setAcousticSignatureRepresentationIndex(short pAcousticSignatureRepresentationIndex)
{
    acousticSignatureRepresentationIndex = pAcousticSignatureRepresentationIndex;
    return this;
}
/** Utility setter for {@link SEESPdu#acousticSignatureRepresentationIndex}
  * @param pAcousticSignatureRepresentationIndex new value of interest
  * @return same object to permit progressive setters */
public SEESPdu setAcousticSignatureRepresentationIndex(int pAcousticSignatureRepresentationIndex){
    acousticSignatureRepresentationIndex = (short) pAcousticSignatureRepresentationIndex;
    return this;
}

/** Getter for {@link SEESPdu#acousticSignatureRepresentationIndex}
  * @return value of interest */
public short getAcousticSignatureRepresentationIndex()
{
    return acousticSignatureRepresentationIndex; 
}

/** Setter for {@link SEESPdu#radarCrossSectionSignatureRepresentationIndex}
  * @param pRadarCrossSectionSignatureRepresentationIndex new value of interest
  * @return same object to permit progressive setters */
public SEESPdu setRadarCrossSectionSignatureRepresentationIndex(short pRadarCrossSectionSignatureRepresentationIndex)
{
    radarCrossSectionSignatureRepresentationIndex = pRadarCrossSectionSignatureRepresentationIndex;
    return this;
}
/** Utility setter for {@link SEESPdu#radarCrossSectionSignatureRepresentationIndex}
  * @param pRadarCrossSectionSignatureRepresentationIndex new value of interest
  * @return same object to permit progressive setters */
public SEESPdu setRadarCrossSectionSignatureRepresentationIndex(int pRadarCrossSectionSignatureRepresentationIndex){
    radarCrossSectionSignatureRepresentationIndex = (short) pRadarCrossSectionSignatureRepresentationIndex;
    return this;
}

/** Getter for {@link SEESPdu#radarCrossSectionSignatureRepresentationIndex}
  * @return value of interest */
public short getRadarCrossSectionSignatureRepresentationIndex()
{
    return radarCrossSectionSignatureRepresentationIndex; 
}

/** Setter for {@link SEESPdu#propulsionSystemData}
  * @param pPropulsionSystemData new value of interest
  * @return same object to permit progressive setters */
public SEESPdu setPropulsionSystemData(List<PropulsionSystemData> pPropulsionSystemData)
{
    propulsionSystemData = pPropulsionSystemData;
    return this;
}

/** Getter for {@link SEESPdu#propulsionSystemData}
  * @return value of interest */
public List<PropulsionSystemData> getPropulsionSystemData()
{
    return propulsionSystemData; 
}

/** Setter for {@link SEESPdu#vectoringSystemData}
  * @param pVectoringSystemData new value of interest
  * @return same object to permit progressive setters */
public SEESPdu setVectoringSystemData(List<VectoringNozzleSystem> pVectoringSystemData)
{
    vectoringSystemData = pVectoringSystemData;
    return this;
}

/** Getter for {@link SEESPdu#vectoringSystemData}
  * @return value of interest */
public List<VectoringNozzleSystem> getVectoringSystemData()
{
    return vectoringSystemData; 
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
       orginatingEntityID.marshal(dos);
       dos.writeShort(infraredSignatureRepresentationIndex);
       dos.writeShort(acousticSignatureRepresentationIndex);
       dos.writeShort(radarCrossSectionSignatureRepresentationIndex);
       dos.writeShort(propulsionSystemData.size());
       dos.writeShort(vectoringSystemData.size());

       for(int idx = 0; idx < propulsionSystemData.size(); idx++)
       {
            PropulsionSystemData aPropulsionSystemData = propulsionSystemData.get(idx);
            aPropulsionSystemData.marshal(dos);
       }


       for(int idx = 0; idx < vectoringSystemData.size(); idx++)
       {
            VectoringNozzleSystem aVectoringNozzleSystem = vectoringSystemData.get(idx);
            aVectoringNozzleSystem.marshal(dos);
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
        uPosition += orginatingEntityID.unmarshal(dis);
        infraredSignatureRepresentationIndex = (short)dis.readUnsignedShort();
        uPosition += 2;
        acousticSignatureRepresentationIndex = (short)dis.readUnsignedShort();
        uPosition += 2;
        radarCrossSectionSignatureRepresentationIndex = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfPropulsionSystems = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfVectoringNozzleSystems = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < numberOfPropulsionSystems; idx++)
        {
            PropulsionSystemData anX = new PropulsionSystemData();
            uPosition += anX.unmarshal(dis);
            propulsionSystemData.add(anX);
        }

        for(int idx = 0; idx < numberOfVectoringNozzleSystems; idx++)
        {
            VectoringNozzleSystem anX = new VectoringNozzleSystem();
            uPosition += anX.unmarshal(dis);
            vectoringSystemData.add(anX);
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
   orginatingEntityID.marshal(byteBuffer);
   byteBuffer.putShort( (short)infraredSignatureRepresentationIndex);
   byteBuffer.putShort( (short)acousticSignatureRepresentationIndex);
   byteBuffer.putShort( (short)radarCrossSectionSignatureRepresentationIndex);
   byteBuffer.putShort( (short)propulsionSystemData.size());
   byteBuffer.putShort( (short)vectoringSystemData.size());

   for(int idx = 0; idx < propulsionSystemData.size(); idx++)
   {
        PropulsionSystemData aPropulsionSystemData = propulsionSystemData.get(idx);
        aPropulsionSystemData.marshal(byteBuffer);
   }


   for(int idx = 0; idx < vectoringSystemData.size(); idx++)
   {
        VectoringNozzleSystem aVectoringNozzleSystem = vectoringSystemData.get(idx);
        aVectoringNozzleSystem.marshal(byteBuffer);
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

    orginatingEntityID.unmarshal(byteBuffer);
    infraredSignatureRepresentationIndex = (short)(byteBuffer.getShort() & 0xFFFF);
    acousticSignatureRepresentationIndex = (short)(byteBuffer.getShort() & 0xFFFF);
    radarCrossSectionSignatureRepresentationIndex = (short)(byteBuffer.getShort() & 0xFFFF);
    numberOfPropulsionSystems = (short)(byteBuffer.getShort() & 0xFFFF);
    numberOfVectoringNozzleSystems = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < numberOfPropulsionSystems; idx++)
    {
    PropulsionSystemData anX = new PropulsionSystemData();
    anX.unmarshal(byteBuffer);
    propulsionSystemData.add(anX);
    }

    for(int idx = 0; idx < numberOfVectoringNozzleSystems; idx++)
    {
    VectoringNozzleSystem anX = new VectoringNozzleSystem();
    anX.unmarshal(byteBuffer);
    vectoringSystemData.add(anX);
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

     final SEESPdu rhs = (SEESPdu)obj;

     if( ! (orginatingEntityID.equals( rhs.orginatingEntityID) )) ivarsEqual = false;
     if( ! (infraredSignatureRepresentationIndex == rhs.infraredSignatureRepresentationIndex)) ivarsEqual = false;
     if( ! (acousticSignatureRepresentationIndex == rhs.acousticSignatureRepresentationIndex)) ivarsEqual = false;
     if( ! (radarCrossSectionSignatureRepresentationIndex == rhs.radarCrossSectionSignatureRepresentationIndex)) ivarsEqual = false;

     for(int idx = 0; idx < propulsionSystemData.size(); idx++)
        if( ! ( propulsionSystemData.get(idx).equals(rhs.propulsionSystemData.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < vectoringSystemData.size(); idx++)
        if( ! ( vectoringSystemData.get(idx).equals(rhs.vectoringSystemData.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" orginatingEntityID: ").append(orginatingEntityID).append("\n");
    sb.append(" infraredSignatureRepresentationIndex: ").append(infraredSignatureRepresentationIndex).append("\n");
    sb.append(" acousticSignatureRepresentationIndex: ").append(acousticSignatureRepresentationIndex).append("\n");
    sb.append(" radarCrossSectionSignatureRepresentationIndex: ").append(radarCrossSectionSignatureRepresentationIndex).append("\n");
    sb.append(" propulsionSystemData: ").append("\n");
    propulsionSystemData.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" vectoringSystemData: ").append("\n");
    vectoringSystemData.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
