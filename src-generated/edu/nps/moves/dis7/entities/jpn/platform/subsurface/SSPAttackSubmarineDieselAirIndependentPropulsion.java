package edu.nps.moves.dis7.entities.jpn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@24faea88;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 31800
 */
public class SSPAttackSubmarineDieselAirIndependentPropulsion extends EntityType
{
    /** Default constructor */
    public SSPAttackSubmarineDieselAirIndependentPropulsion()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 31800, SSP (Attack Submarine - Diesel Air-Independent Propulsion)
    }
}
