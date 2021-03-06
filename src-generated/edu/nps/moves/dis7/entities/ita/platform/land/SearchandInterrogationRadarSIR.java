package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5d1659ea;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 18300
 */
public class SearchandInterrogationRadarSIR extends EntityType
{
    /** Default constructor */
    public SearchandInterrogationRadarSIR()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 18296, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 18297, SPADA SAM System
        setSpecific((byte)1); // uid 18298, Detection Center (DC)
        setExtra((byte)2); // uid 18300, Search and Interrogation Radar (SIR)
    }
}
