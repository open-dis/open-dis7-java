/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 7.10.6 Used to communicate detailed information about the addition/modification of a synthetic environment object that is geometrically anchored to the terrain with a set of three or more points that come to a closure.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class ArealObjectStatePdu extends SyntheticEnvironmentFamilyPdu implements Serializable
{
   /** Object in synthetic environment */
   protected ObjectIdentifier  objectID = new ObjectIdentifier(); 

   /** Object with which this point object is associated */
   protected ObjectIdentifier  referencedObjectID = new ObjectIdentifier(); 

   /** unique update number of each state transition of an object */
   protected short  updateNumber;

   /** force ID uid 6 */
   protected ForceID forceID = ForceID.values()[0];

   /** modifications enumeration uid 242 */
   protected ObjectStateModificationArealObject modifications = new ObjectStateModificationArealObject();

   /** Object type */
   protected ObjectType  objectType = new ObjectType(); 

   /** Object appearance */
   protected int  specificObjectAppearance;

   /** Object appearance */
   protected short  generalObjectAppearance;

   /** Number of points */
   protected short  numberOfPoints;

   /** requesterID */
   protected SimulationAddress  requesterID = new SimulationAddress(); 

   /** receiver ID */
   protected SimulationAddress  receivingID = new SimulationAddress(); 

   /** location of object */
   protected List< Vector3Double > objectLocation = new ArrayList< Vector3Double >();
 

/** Constructor */
 public ArealObjectStatePdu()
 {
    setPduType( DISPDUType.AREAL_OBJECT_STATE );
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
   marshalSize += objectID.getMarshalledSize();
   marshalSize += referencedObjectID.getMarshalledSize();
   marshalSize += 2;  // updateNumber
   marshalSize += forceID.getMarshalledSize();
   marshalSize += modifications.getMarshalledSize();
   marshalSize += objectType.getMarshalledSize();
   marshalSize += 4;  // specificObjectAppearance
   marshalSize += 2;  // generalObjectAppearance
   marshalSize += 2;  // numberOfPoints
   marshalSize += requesterID.getMarshalledSize();
   marshalSize += receivingID.getMarshalledSize();
   for(int idx=0; idx < objectLocation.size(); idx++)
   {
        Vector3Double listElement = objectLocation.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link ArealObjectStatePdu#objectID}
  * @param pObjectID new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setObjectID(ObjectIdentifier pObjectID)
{
    objectID = pObjectID;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#objectID}
  * @return value of interest */
public ObjectIdentifier getObjectID()
{
    return objectID; 
}

/** Setter for {@link ArealObjectStatePdu#referencedObjectID}
  * @param pReferencedObjectID new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setReferencedObjectID(ObjectIdentifier pReferencedObjectID)
{
    referencedObjectID = pReferencedObjectID;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#referencedObjectID}
  * @return value of interest */
public ObjectIdentifier getReferencedObjectID()
{
    return referencedObjectID; 
}

/** Setter for {@link ArealObjectStatePdu#updateNumber}
  * @param pUpdateNumber new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setUpdateNumber(short pUpdateNumber)
{
    updateNumber = pUpdateNumber;
    return this;
}
/** Utility setter for {@link ArealObjectStatePdu#updateNumber}
  * @param pUpdateNumber new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setUpdateNumber(int pUpdateNumber){
    updateNumber = (short) pUpdateNumber;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#updateNumber}
  * @return value of interest */
public short getUpdateNumber()
{
    return updateNumber; 
}

/** Setter for {@link ArealObjectStatePdu#forceID}
  * @param pForceID new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setForceID(ForceID pForceID)
{
    forceID = pForceID;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#forceID}
  * @return value of interest */
public ForceID getForceID()
{
    return forceID; 
}

/** Setter for {@link ArealObjectStatePdu#modifications}
  * @param pModifications new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setModifications(ObjectStateModificationArealObject pModifications)
{
    modifications = pModifications;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#modifications}
  * @return value of interest */
public ObjectStateModificationArealObject getModifications()
{
    return modifications; 
}

/** Setter for {@link ArealObjectStatePdu#objectType}
  * @param pObjectType new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setObjectType(ObjectType pObjectType)
{
    objectType = pObjectType;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#objectType}
  * @return value of interest */
public ObjectType getObjectType()
{
    return objectType; 
}

/** Setter for {@link ArealObjectStatePdu#specificObjectAppearance}
  * @param pSpecificObjectAppearance new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setSpecificObjectAppearance(int pSpecificObjectAppearance)
{
    specificObjectAppearance = pSpecificObjectAppearance;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#specificObjectAppearance}
  * @return value of interest */
public int getSpecificObjectAppearance()
{
    return specificObjectAppearance; 
}

/** Setter for {@link ArealObjectStatePdu#generalObjectAppearance}
  * @param pGeneralObjectAppearance new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setGeneralObjectAppearance(short pGeneralObjectAppearance)
{
    generalObjectAppearance = pGeneralObjectAppearance;
    return this;
}
/** Utility setter for {@link ArealObjectStatePdu#generalObjectAppearance}
  * @param pGeneralObjectAppearance new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setGeneralObjectAppearance(int pGeneralObjectAppearance){
    generalObjectAppearance = (short) pGeneralObjectAppearance;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#generalObjectAppearance}
  * @return value of interest */
public short getGeneralObjectAppearance()
{
    return generalObjectAppearance; 
}

/** Setter for {@link ArealObjectStatePdu#requesterID}
  * @param pRequesterID new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setRequesterID(SimulationAddress pRequesterID)
{
    requesterID = pRequesterID;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#requesterID}
  * @return value of interest */
public SimulationAddress getRequesterID()
{
    return requesterID; 
}

/** Setter for {@link ArealObjectStatePdu#receivingID}
  * @param pReceivingID new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setReceivingID(SimulationAddress pReceivingID)
{
    receivingID = pReceivingID;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#receivingID}
  * @return value of interest */
public SimulationAddress getReceivingID()
{
    return receivingID; 
}

/** Setter for {@link ArealObjectStatePdu#objectLocation}
  * @param pObjectLocation new value of interest
  * @return same object to permit progressive setters */
public ArealObjectStatePdu setObjectLocation(List<Vector3Double> pObjectLocation)
{
    objectLocation = pObjectLocation;
    return this;
}

/** Getter for {@link ArealObjectStatePdu#objectLocation}
  * @return value of interest */
public List<Vector3Double> getObjectLocation()
{
    return objectLocation; 
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
       objectID.marshal(dos);
       referencedObjectID.marshal(dos);
       dos.writeShort(updateNumber);
       forceID.marshal(dos);
       modifications.marshal(dos);
       objectType.marshal(dos);
       dos.writeInt(specificObjectAppearance);
       dos.writeShort(generalObjectAppearance);
       dos.writeShort(objectLocation.size());
       requesterID.marshal(dos);
       receivingID.marshal(dos);

       for(int idx = 0; idx < objectLocation.size(); idx++)
       {
            Vector3Double aVector3Double = objectLocation.get(idx);
            aVector3Double.marshal(dos);
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
        uPosition += objectID.unmarshal(dis);
        uPosition += referencedObjectID.unmarshal(dis);
        updateNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        forceID = ForceID.unmarshalEnum(dis);
        uPosition += forceID.getMarshalledSize();
        uPosition += modifications.unmarshal(dis);
        uPosition += objectType.unmarshal(dis);
        specificObjectAppearance = dis.readInt();
        uPosition += 4;
        generalObjectAppearance = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfPoints = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += requesterID.unmarshal(dis);
        uPosition += receivingID.unmarshal(dis);
        for(int idx = 0; idx < numberOfPoints; idx++)
        {
            Vector3Double anX = new Vector3Double();
            uPosition += anX.unmarshal(dis);
            objectLocation.add(anX);
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
   objectID.marshal(byteBuffer);
   referencedObjectID.marshal(byteBuffer);
   byteBuffer.putShort( (short)updateNumber);
   forceID.marshal(byteBuffer);
   modifications.marshal(byteBuffer);
   objectType.marshal(byteBuffer);
   byteBuffer.putInt( (int)specificObjectAppearance);
   byteBuffer.putShort( (short)generalObjectAppearance);
   byteBuffer.putShort( (short)objectLocation.size());
   requesterID.marshal(byteBuffer);
   receivingID.marshal(byteBuffer);

   for(int idx = 0; idx < objectLocation.size(); idx++)
   {
        Vector3Double aVector3Double = objectLocation.get(idx);
        aVector3Double.marshal(byteBuffer);
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

    objectID.unmarshal(byteBuffer);
    referencedObjectID.unmarshal(byteBuffer);
    updateNumber = (short)(byteBuffer.getShort() & 0xFFFF);
    forceID = ForceID.unmarshalEnum(byteBuffer);
    modifications.unmarshal(byteBuffer);
    objectType.unmarshal(byteBuffer);
    specificObjectAppearance = byteBuffer.getInt();
    generalObjectAppearance = (short)(byteBuffer.getShort() & 0xFFFF);
    numberOfPoints = (short)(byteBuffer.getShort() & 0xFFFF);
    requesterID.unmarshal(byteBuffer);
    receivingID.unmarshal(byteBuffer);
    for(int idx = 0; idx < numberOfPoints; idx++)
    {
    Vector3Double anX = new Vector3Double();
    anX.unmarshal(byteBuffer);
    objectLocation.add(anX);
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

     final ArealObjectStatePdu rhs = (ArealObjectStatePdu)obj;

     if( ! (objectID.equals( rhs.objectID) )) ivarsEqual = false;
     if( ! (referencedObjectID.equals( rhs.referencedObjectID) )) ivarsEqual = false;
     if( ! (updateNumber == rhs.updateNumber)) ivarsEqual = false;
     if( ! (forceID == rhs.forceID)) ivarsEqual = false;
     if( ! (modifications.equals( rhs.modifications) )) ivarsEqual = false;
     if( ! (objectType.equals( rhs.objectType) )) ivarsEqual = false;
     if( ! (specificObjectAppearance == rhs.specificObjectAppearance)) ivarsEqual = false;
     if( ! (generalObjectAppearance == rhs.generalObjectAppearance)) ivarsEqual = false;
     if( ! (requesterID.equals( rhs.requesterID) )) ivarsEqual = false;
     if( ! (receivingID.equals( rhs.receivingID) )) ivarsEqual = false;

     for(int idx = 0; idx < objectLocation.size(); idx++)
        if( ! ( objectLocation.get(idx).equals(rhs.objectLocation.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" objectID: ").append(objectID).append("\n");
    sb.append(" referencedObjectID: ").append(referencedObjectID).append("\n");
    sb.append(" updateNumber: ").append(updateNumber).append("\n");
    sb.append(" forceID: ").append(forceID).append("\n");
    sb.append(" modifications: ").append(modifications).append("\n");
    sb.append(" objectType: ").append(objectType).append("\n");
    sb.append(" specificObjectAppearance: ").append(specificObjectAppearance).append("\n");
    sb.append(" generalObjectAppearance: ").append(generalObjectAppearance).append("\n");
    sb.append(" requesterID: ").append(requesterID).append("\n");
    sb.append(" receivingID: ").append(receivingID).append("\n");
    sb.append(" objectLocation: ").append("\n");
    objectLocation.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
