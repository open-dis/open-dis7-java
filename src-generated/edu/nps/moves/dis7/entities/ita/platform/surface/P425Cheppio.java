package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75390459;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18372
 */
public class P425Cheppio extends EntityType
{
    /** Default constructor */
    public P425Cheppio()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)14); // uid 18366, Hydrofoil
        setSubCategory((byte)1); // uid 18367, Sparviero Class (Hydrofoil-Missile)
        setSpecific((byte)5); // uid 18372, P425 Cheppio
    }
}
