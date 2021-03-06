package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51399530;
 * Country: Denmark (DNK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 25517
 */
public class TorFutura extends EntityType
{
    /** Default constructor */
    public TorFutura()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 25444, Auxiliary
        setSubCategory((byte)2); // uid 25515, ARK Ships
        setSpecific((byte)2); // uid 25517, Tor Futura
    }
}
