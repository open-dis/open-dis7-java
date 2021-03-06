package edu.nps.moves.dis7.entities.prt.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3c443976;
 * Country: Portugal (PRT);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 23100
 */
public class Type209PNclass extends EntityType
{
    /** Default constructor */
    public Type209PNclass()
    {
        setCountry(Country.PORTUGAL_PRT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23099, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 23100, Type 209PN class
    }
}
