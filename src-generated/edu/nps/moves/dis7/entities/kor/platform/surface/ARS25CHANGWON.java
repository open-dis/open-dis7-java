package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6b5176f2;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17725
 */
public class ARS25CHANGWON extends EntityType
{
    /** Default constructor */
    public ARS25CHANGWON()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17711, Auxiliary
        setSubCategory((byte)5); // uid 17723, Salvage Ship
        setSpecific((byte)2); // uid 17725, ARS 25 CHANG WON
    }
}
