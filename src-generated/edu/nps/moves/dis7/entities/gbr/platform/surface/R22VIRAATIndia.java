package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3289079a;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 15369
 */
public class R22VIRAATIndia extends EntityType
{
    /** Default constructor */
    public R22VIRAATIndia()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)12); // uid 15364, Light carrier
        setSubCategory((byte)1); // uid 15365, Light aircraft carrier (CVSG)
        setSpecific((byte)4); // uid 15369, R 22 VIRAAT (India)
    }
}
