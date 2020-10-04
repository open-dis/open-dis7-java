package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@614c5515
 * Country: Australia (AUS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17604
 */
public class AmphibiousAssaultShip extends EntityType
{
    public AmphibiousAssaultShip()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 17604, Amphibious Assault Ship
    }
}
