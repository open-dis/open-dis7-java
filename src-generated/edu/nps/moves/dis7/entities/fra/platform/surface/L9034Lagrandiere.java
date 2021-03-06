package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58cbafc2;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16025
 */
public class L9034Lagrandiere extends EntityType
{
    /** Default constructor */
    public L9034Lagrandiere()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 16017, Landing Craft
        setSubCategory((byte)2); // uid 16020, Batral type (light transports and landing ships)
        setSpecific((byte)5); // uid 16025, L 9034 La grandiere
    }
}
