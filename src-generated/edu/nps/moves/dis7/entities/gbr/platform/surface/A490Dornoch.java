package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58015e56;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 15486
 */
public class A490Dornoch extends EntityType
{
    /** Default constructor */
    public A490Dornoch()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 15370, Auxiliary
        setSubCategory((byte)24); // uid 15465, Clovelly class (fleet tenders)
        setSpecific((byte)21); // uid 15486, A 490 Dornoch
    }
}
