package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@64c63c79;
 * Country: Greece (GRC);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23344
 */
public class A376Orion extends EntityType
{
    /** Default constructor */
    public A376Orion()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 23337, Auxiliary
        setSubCategory((byte)2); // uid 23340, Ouranos class
        setSpecific((byte)4); // uid 23344, A376 Orion
    }
}
