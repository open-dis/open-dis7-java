package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@334ebcaa;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 15385
 */
public class A122Olwen extends EntityType
{
    /** Default constructor */
    public A122Olwen()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 15370, Auxiliary
        setSubCategory((byte)7); // uid 15384, Ol class (large fleet tankers (AO))
        setSpecific((byte)1); // uid 15385, A 122 Olwen
    }
}
