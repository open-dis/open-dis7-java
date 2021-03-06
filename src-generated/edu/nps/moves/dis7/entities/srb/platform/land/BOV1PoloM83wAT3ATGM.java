package edu.nps.moves.dis7.entities.srb.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3cb8c8ce;
 * Country: Serbia (SRB);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30150
 */
public class BOV1PoloM83wAT3ATGM extends EntityType
{
    /** Default constructor */
    public BOV1PoloM83wAT3ATGM()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 30145, Armored Fighting Vehicle
        setSubCategory((byte)4); // uid 30149, BOV APC
        setSpecific((byte)1); // uid 30150, BOV-1 Polo M-83 w/ AT-3 ATGM
    }
}
