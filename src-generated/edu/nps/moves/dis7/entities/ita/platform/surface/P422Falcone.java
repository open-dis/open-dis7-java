package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a891c97;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18369
 */
public class P422Falcone extends EntityType
{
    /** Default constructor */
    public P422Falcone()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)14); // uid 18366, Hydrofoil
        setSubCategory((byte)1); // uid 18367, Sparviero Class (Hydrofoil-Missile)
        setSpecific((byte)2); // uid 18369, P422 Falcone
    }
}
