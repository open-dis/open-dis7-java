package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@13579834;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28266
 */
public class Y8019Balgzand extends EntityType
{
    /** Default constructor */
    public Y8019Balgzand()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18942, Auxiliary
        setSubCategory((byte)7); // uid 28264, Breezand Class (Small Harbour Tugs)
        setSpecific((byte)2); // uid 28266, Y8019 Balgzand
    }
}
